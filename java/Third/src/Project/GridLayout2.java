package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class A  {
    JFrame frame;
    JPanel panel1;
    JButton loginbutton;
    JButton withdrawbutton;
    JButton depositbutton;
    JButton balancebutton;
    JButton Transferbutton;
    JTextArea transaction;
    JTextField username;
    JTextField amountfield;
    JPasswordField psw;

    double amount =1000;
    public boolean check()
    {
        String user = "12345";
        String pass = "1234";
        if(user.equals(username.getText())&&pass.equals(new String(psw.getPassword())))
        {
            withdrawbutton.setEnabled(true);
            depositbutton.setEnabled(true);
            balancebutton.setEnabled(true);
            Transferbutton.setEnabled(true);
            return true;
        }
        else
return false;
    }
    public A() {
        frame = new JFrame("ATM");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(1,10));
         panel1 = new JPanel();
        transaction = new JTextArea("Transaction History :\n");
        transaction.setEditable(false);
        loginbutton = new JButton("LOGIN");
        withdrawbutton = new JButton("Withdraw");
        depositbutton = new JButton("Deposit");
        balancebutton = new JButton("Balance ");
        Transferbutton = new JButton("transfer");
        amountfield = new JTextField(5);

        withdrawbutton.setEnabled(false);
        depositbutton.setEnabled(false);
        balancebutton.setEnabled(false);
        Transferbutton.setEnabled(false);
        amountfield.setEnabled(false);
//        amountfield.setVisible(false);


        username =new JTextField(10);
        psw=new JPasswordField(5);
        panel1.add(username);
        panel1.add(psw);

        panel1.add(loginbutton);
        panel1.add(amountfield,BorderLayout.SOUTH);
        panel1.add(withdrawbutton);
        panel1.add(depositbutton);
        panel1.add(balancebutton);
        panel1.add(Transferbutton);


        frame.add(panel1, BorderLayout.NORTH);
        frame.add(new JScrollPane(transaction), BorderLayout.CENTER);

        balancebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str="Balance : "+amount;
                appendtransaction(str);
            }
        });



        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountfield.setVisible(true);
                amountfield.setEnabled(true);
                if (check()) {
                        appendtransaction("Login Success");
                        }
                else {
                    appendtransaction("Login Failed");
                }
            }
        });

        withdrawbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amt=getamount();
                amountfield.setVisible(true);
                amountfield.setEnabled(true);
                if (amt > 0 && amt < amount) {
                    amount-=amt;
                    appendtransaction("Amount Withdrawn "+ amt);
                }
                else {
                    appendtransaction("Something went wrong !");
                }


            }
        });
        frame.setVisible(true);
    }

    public double getamount() {
        try {
            return Double.parseDouble(amountfield.getText());
        } catch (NumberFormatException e) {
            System.out.println("Error Occured ");
            e.printStackTrace();
        }
        return 0.0;
    }

    public void appendtransaction(String str) {
        transaction.append(str+"\n");

    }
}
public class GridLayout2  {
    public static void main(String[] args) {
        new A();
    }
}
