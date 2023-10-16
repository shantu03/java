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
        field.addActionListener(e -> field.setText((field.getText().toUpperCase())));
//        c.add(field);




        JTextArea textArea = new JTextArea();
        textArea.setBounds(10,10,460,180);
        c.add(textArea);

        var menuBar = getjMenuBar(textArea);        //BEST TO GET TO LEARN THIS
        frame.setJMenuBar(menuBar);


        String[] arr = {"shantanu", "raviraj", "avishkar", "bharat", "sanket"};

        JComboBox<String> jComboBox=new JComboBox<>(arr);
        jComboBox.setBounds(30,210,90,40);
        JLabel label = new JLabel("");
        label.setBounds(150,210,90,50);
        jComboBox.addItemListener(e -> {
            String temp = jComboBox.getSelectedItem().toString();
            label.setText(temp);
        });
        c.add(jComboBox);
        c.add(label);


    }

    private static JMenuBar getjMenuBar(JTextArea textArea) {
        JMenuBar menuBar = new JMenuBar();

        JMenu file,edit;
        JMenuItem i1,i2,i3,i4;
        file = new JMenu("File");
        edit = new JMenu("Edit");
        i1 = new JMenuItem("Save");
        i2 = new JMenuItem("Print");
        i3 = new JMenuItem("Copy");
        i4 = new JMenuItem("Paste");
        JMenuItem i5 = new JMenuItem("Select All");
        i1.addActionListener(e -> textArea.setText("saving the file "));
        i2.addActionListener(e -> textArea.setText("printing the file"));
        i3.addActionListener(e -> textArea.copy());
        i4.addActionListener(e -> textArea.paste());
        i5.addActionListener(e -> textArea.selectAll());
        file.add(i1);
        file.add(i2);
        edit.add(i3);
        edit.add(i4);
        edit.add(i5);
        menuBar.add(file);
        menuBar.add(edit);
        return menuBar;
    }
}
