package Project;

import javax.swing.*;
import java.awt.*;

public class L1_L2_L3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lecture 1,2,3");
        frame.setBounds(300, 150, 400, 500);
        ImageIcon img = new ImageIcon("E:\\Code\\java\\Third\\src\\Project\\img (1).jpg");
        frame.setIconImage(img.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        frame.setResizable(false);

        Container c = frame.getContentPane();
//        LECTURE 1
//        frame.setLayout(new GridLayout());
        JLabel userlabel = new JLabel("UserID : ");
        userlabel.setBounds(20,93,60,30);
        c.add(userlabel);

//        LECTURE 2
//        frame.setLayout(new FlowLayout());
        JLabel passlabel = new JLabel("Password : ");
        passlabel.setBounds(20,117,70,40);
        Font font = new Font("Times New Roman", Font.ITALIC, 24);
//        passlabel.setFont(font);
        c.add(passlabel);


        frame.setLayout(null);
        JLabel imagelable = new JLabel("shantu",img,JLabel.RIGHT);
        imagelable.setBounds(0,0,5000 ,1000);
        imagelable.setBounds(10,50,img.getIconWidth(),img.getIconHeight());
//        c.add(label2);


//        LECTURE 3
        JTextField accountfield = new JTextField();
        accountfield.setBounds(100,100,90,20);
        c.add(accountfield);

//        LECTURE 4
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100,130,90,20);
        passwordField.setEchoChar('*');
        passwordField.setEchoChar((char) 0);
        c.add(passwordField);


    }
}
