package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L8_L9_L10 {
    /*RADIO BUTTON WITH GROUP*/
    public static void main(String[] args) {
        JFrame frame = new JFrame("L8_and_L9");
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
         radioButton.setSelected(true);
         buttonGroup.add(radioButton1);

        c.add(radioButton);
        c.add(radioButton1);

        JCheckBox c1 = new JCheckBox("C");
        JCheckBox c2 = new JCheckBox("C++");
        JCheckBox c3 = new JCheckBox("JAVA");
        JCheckBox c4 = new JCheckBox("KOTLIN");
        JCheckBox c5 = new JCheckBox("PYTHON");
        JCheckBox c6 = new JCheckBox("REACT");

        JLabel label = new JLabel("Select course : ");
        label.setBounds(20,70,120,50);
        c1.setSelected(true);
        c1.setBounds(20,100,50,20);
        c2.setBounds(90,100,50,20);
        c3.setBounds(160,100,70,20);
        c4.setBounds(230,100,90,20);
        c5.setBounds(20,130,90,20);
        c6.setBounds(130,130,90,20);
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c5);
        c.add(c6);
        c.add(label);

//        COMBOBOX L10
        String[] arr = {"SANGLI", "SATARA", "KOLHAPUR", "PUNE", "MUMBAI", "SOLAPUR"};
        JComboBox<String> comboBox = new JComboBox<>(arr);

        JLabel jLabel = new JLabel("SELECT CITY :");
        jLabel.setBounds(20,160,120,40);

        comboBox.setBounds(140,160,120,40);
//        comboBox.setSelectedIndex(2);
        comboBox.setFont(new Font("Times New Roman",Font.BOLD,12));

        JButton button = new JButton("OK");
        button.setFont(new Font("arial",Font.PLAIN,12));
        button.setBounds(280,160,60,20);
        JTextArea textArea = new JTextArea("Selected :");
        textArea.setBounds(20,200,290,130);
        textArea.setLineWrap(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String l=textArea.getText();

                 l ="Selected : \n"+comboBox.getSelectedItem();
                 textArea.setText(l);


            }
        });
        c.add(button);
        c.add(textArea);
        c.add(comboBox);
        c.add(jLabel);





    }
}
