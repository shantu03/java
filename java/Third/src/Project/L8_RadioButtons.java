package Project;

import javax.swing.*;
import java.awt.*;

public class L8_RadioButtons {
    /*RADIO BUTTON WITH GROUP*/
    public static void main(String[] args) {
        JFrame frame = new JFrame("L*");
        Container c =frame.getContentPane();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        c.setLayout(null);
//        frame.setLocationRelativeTo(null);
        frame.setSize(340,300);

        JRadioButton radioButton = new JRadioButton("Male");
        radioButton.setBounds(20,50,60,20);
        JRadioButton radioButton1 = new JRadioButton("Female");
        radioButton1.setBounds(100,50,70,20);
         ButtonGroup buttonGroup=new ButtonGroup();
         buttonGroup.add(radioButton);
         buttonGroup.add(radioButton1);

        c.add(radioButton);
        c.add(radioButton1);







    }
}
