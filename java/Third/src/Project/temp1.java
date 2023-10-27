package Project;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

public class temp1 extends JFrame {
    private JTextField accountField;
    private JPasswordField pinField;
    private JButton loginButton;
    private JLabel statusLabel;
    private JButton balanceButton;
    private JButton withdrawButton;
    private JButton depositButton;
    private JButton transferButton;
    private JTextField amountField;
    private JTextArea transactionHistoryArea;

    double balance;
    String usr;

    public temp1() throws SQLException {
        setTitle("ATM Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        JLabel accountLabel = new JLabel("Account Number:");
        JLabel pinLabel = new JLabel("PIN:");
        JLabel amountLabel = new JLabel("Amount:");

        accountField = new JTextField(10);
        pinField = new JPasswordField(10);
        amountField = new JTextField(10);

        loginButton = new JButton("Login");
        balanceButton = new JButton("Check Balance");
        withdrawButton = new JButton("Withdraw");
        depositButton = new JButton("Deposit");
        transferButton = new JButton("Transfer");
        statusLabel = new JLabel("Please log in.");
        transactionHistoryArea = new JTextArea(5, 20);

        transactionHistoryArea.setEditable(false);


        panel.add(accountLabel);
        panel.add(accountField);
        panel.add(pinLabel);
        panel.add(pinField);
        panel.add(loginButton);
        panel.add(statusLabel);
        panel.add(balanceButton);
        panel.add(withdrawButton);
        panel.add(depositButton);
        panel.add(transferButton);
        panel.add(amountLabel);
        panel.add(amountField);

        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(transactionHistoryArea), BorderLayout.CENTER);


        DatabaseConnection c=new DatabaseConnection();
//        Statement smt=c.connection.createStatement();
        PreparedStatement preparedStatement=c.connection.prepareStatement("update login set amount=? where username=?");


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String accountNumber = accountField.getText();
                String pin = new String(pinField.getPassword());

                try {
                    if (isValidAccount(accountNumber, pin)) {
                        statusLabel.setText("Logged in as Account: " + accountNumber);
                        enableTransactionButtons(true);
                        pinField.setEnabled(false);
                        accountLabel.setText("Receiver A/C number : ");
                        accountField.setText("");
                    } else {
                        statusLabel.setText("Login failed. Please try again.");
                    }
                } catch (Exception exception) {
                    System.out.println("Error in Login Field");
                }
            }
        });

        balanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appendTransactionHistory("Balance check: $" + formatCurrency(balance));
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = getAmount();
                amountField.setText("");
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    appendTransactionHistory("Withdraw: $" + formatCurrency(amount));

                    try {
                        preparedStatement.setDouble(1,balance);
                        preparedStatement.setString(2,usr);
                        preparedStatement.executeUpdate();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }




                } else {
                    appendTransactionHistory("Invalid withdrawal amount.");
                }
            }
        });

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = getAmount();
                amountField.setText("");

                if (amount > 0) {
                    balance += amount;
                    appendTransactionHistory("Deposit: $" + formatCurrency(amount));


                    try {
                        preparedStatement.setDouble(1,balance);
                        preparedStatement.setString(2,usr);
                        preparedStatement.executeUpdate();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }


                } else {
                    appendTransactionHistory("Invalid deposit amount.");
                }
            }
        });

        transferButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = getAmount();


                if ((amount > 0 && amount <= balance)&& !accountField.getText().equals("")) {
                    balance -= amount;
                    appendTransactionHistory("Transfer: $" + formatCurrency(amount) + " to Account " + accountField.getText());

                    try {
                        preparedStatement.setDouble(1,balance);
                        preparedStatement.setString(2,usr);
                        preparedStatement.executeUpdate();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }


                } else {
                    appendTransactionHistory("Invalid transfer amount.");
                }
                amountField.setText("");
                accountField.setText("");
            }
        });

        enableTransactionButtons(false);
    }

    private boolean isValidAccount(String accountNumber, String pin) throws SQLException {
        DatabaseConnection c=new DatabaseConnection();
        Statement smt=c.connection.createStatement();
        ResultSet set = smt.executeQuery("select * from login");
        while (set.next()) {
            String user = set.getString(1);
            String pass = set.getString(2);
            if (user.equals(accountNumber) && pass.equals(pin)) {
                usr=user;
                balance = set.getDouble(3);
                return true;
            }
        }
        return false;


    }

    private double getAmount() {
        try {
            return Double.parseDouble(amountField.getText());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    private void appendTransactionHistory(String message) {
        transactionHistoryArea.append(message + "\n");
    }

    private String formatCurrency(double amount) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(amount);
    }

    private void enableTransactionButtons(boolean enable) {
        balanceButton.setEnabled(enable);
        withdrawButton.setEnabled(enable);
        depositButton.setEnabled(enable);
        transferButton.setEnabled(enable);
    }
    public static void main(String[] args) throws SQLException {
        new temp1().setVisible(true);
    }
}