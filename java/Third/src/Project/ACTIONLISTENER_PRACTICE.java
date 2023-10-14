package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ACTIONLISTENER_PRACTICE {
    public static void main(String[] args) {
        JFrame frame = new JFrame("L8_and_L9");
        Container c =frame.getContentPane();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        c.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(500,500);
        JTextField field = new JTextField("");
        field.setBounds(30,30,80,30);
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText((field.getText().toUpperCase()));
            }
        });

        c.add(field); 


    }
}
