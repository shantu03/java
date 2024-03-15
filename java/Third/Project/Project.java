package Project;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;

class Z {
    JFrame frame;
    JTextField loginField;
    JLabel title;
    JPasswordField passwordField;
    JTextArea textArea;
    JPanel panel1;
    JLabel account;
    JLabel pin;

    public Z() {
        frame = new JFrame("ATM INTERFACE MACHINE ");

        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        CardLayout cardLayout = new CardLayout(40, 50);
        panel1 = new JPanel();
        title=new JLabel("ATM MACHINE");
//        title.setBounds(40,50,150,130);
//        title.setSize(150, 160);
//        panel1.setSize(60, 80);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginField = new JTextField(10);
        title.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(title, BorderLayout.NORTH);



        panel1.setLayout(new GridLayout(4,1 ));
        account = new JLabel("Account Number : ");
        account.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(account);
        panel1.add(loginField);

        pin = new JLabel("PIN");
        passwordField = new JPasswordField();
        panel1.add(pin,BorderLayout.CENTER);
        panel1.add(passwordField,BorderLayout.CENTER);


        textArea = new JTextArea("Message : ");
        panel1.add(textArea, BorderLayout.SOUTH);
        frame.add(panel1);


        frame.setVisible(true);
    }

}
public class Project {
    public static void main(String[] args) {
        Z obj =new Z();
    }
}
