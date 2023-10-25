package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    private double balance = 1000.0;

    public temp1() {
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

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String accountNumber = accountField.getText();
                String pin = new String(pinField.getPassword());

                // Replace with your account validation logic
                if (isValidAccount(accountNumber, pin)) {
                    statusLabel.setText("Logged in as Account: " + accountNumber);
                    enableTransactionButtons(true);
                    pinField.setEnabled(false);
                    accountLabel.setText("Receiver A/C number : ");
                    accountField.setText("");
                } else {
                    statusLabel.setText("Login failed. Please try again.");
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
                } else {
                    appendTransactionHistory("Invalid transfer amount.");
                }
                amountField.setText("");
                accountField.setText("");
            }
        });

        enableTransactionButtons(false);
    }

    private boolean isValidAccount(String accountNumber, String pin) {
        // Replace with your account validation logic
        // For the sake of this example, we use a hardcoded account number and PIN.
        return accountNumber.equals("123456") && pin.equals("1234");
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
    public static void main(String[] args) {
                new temp1().setVisible(true);
    }
}
