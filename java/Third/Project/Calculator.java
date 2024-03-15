package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        Container c =frame.getContentPane();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        frame.setLocationRelativeTo(null);
        frame.setSize(340,300);
        c.setLayout(null);
        JLabel label1=new JLabel("NUM 1 : ");
        JLabel label2=new JLabel("NUM 2 : ");
        label1.setBounds(20,30,50,20);
        label2.setBounds(20,70,50,20);

        JLabel label3 = new JLabel("ANSWER : ");
        label3.setBounds(170,45,70,20);

        JTextField ans = new JTextField();
        ans.setBounds(240,45,70,20);

        JTextField num1 = new JTextField(12);
        JTextField num2 = new JTextField(12);
        num1.setBounds(80,30,70,20);
        num2.setBounds(80,70,70,20);


        JLabel label4=new JLabel("OPERATION : ");
        label4.setBounds(20,120,90,20);
        JButton add=new JButton("+");
        add.setBounds(20,160,50,20);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float a = Float.parseFloat(num1.getText());
                    float b = Float.parseFloat(num2.getText());
                    float c = a + b;
                    ans.setText(" " + c);
                    num1.setText("");
                    num2.setText("");
                } catch (Exception exception) {
                    ans.setText("ERROR !");
                }
            }
        });
        JButton sub=new JButton("-");
        sub.setBounds(100,160,50,20);
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                float a = Float.parseFloat(num1.getText());
                float b = Float.parseFloat(num2.getText());
                float c= a-b;
                ans.setText(" "+c);
                    num1.setText("");
                    num2.setText("");
            } catch (Exception exception) {
                ans.setText("ERROR !");
            }
            }
        });
        JButton div=new JButton("/");
        div.setBounds(180,160,50,20);
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                float a = Float.parseFloat(num1.getText());
                float b = Float.parseFloat(num2.getText());
                float c= a/b;
                ans.setText(" "+c);
                    num1.setText("");
                    num2.setText("");
            } catch (Exception exception) {
                ans.setText("ERROR !");
            }
            }
        });
        JButton mul =new JButton("*");
        mul.setBounds(260,160,50,20);
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                float a = Float.parseFloat(num1.getText());
                float b = Float.parseFloat(num2.getText());
                float c= a*b;
                ans.setText(" "+c);
                num1.setText("");
                num2.setText("");
            } catch (Exception exception) {
                ans.setText("ERROR !");
            }
            }
        });


        c.add(label1);
        c.add(label2);
        c.add(num2);
        c.add(num1);
        c.add(label4);
        c.add(ans);
        c.add(label3);
        c.add(add);
        c.add(sub);
        c.add(mul);
        c.add(div);

    }
}
