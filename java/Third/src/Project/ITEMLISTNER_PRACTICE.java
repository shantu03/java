package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class B  implements ItemListener {
    JComboBox comboBox;
    JTextArea textArea1,textArea2;
    JFrame frame;
    Container c ;
    JRadioButton male,female;
    JCheckBox i1,i2,i3,i4,i5,i6;
    JMenuBar menuBar;
    JMenu setting;
    JCheckBoxMenuItem box1;

    public B() {
        frame = new JFrame();
        c = frame.getContentPane();
        frame.setTitle("ITEMLISTENER PRACTICE ");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        c.setLayout(null);

//        COMBO BOX
        String[] arr = {"shantu", "ravi", "avi", "sanket", "mahesh", "bharat"};
        comboBox = new JComboBox(arr);
        comboBox.setBounds(30,30,90,40);
        comboBox.addItemListener(this);
        textArea1 = new JTextArea();
        textArea1.setBounds(140,30,90,90);

        c.add(textArea1);
        c.add(comboBox);


//        RADIO BUTTON
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);
        male.setBounds(30,150,100,30);
        female.setBounds(30,180,100,30);
        male.addItemListener(this);
        female.addItemListener(this);
        c.add(male);
        c.add(female);


//      CHECKBOX
        textArea2=new JTextArea();
        textArea2.setBounds(250,30,60,80);
        textArea2.add(new JScrollBar());
        i1 = new JCheckBox("C");
        i2 = new JCheckBox("C++");
        i3 = new JCheckBox("Java");
        i4 = new JCheckBox("Kotlin");
        i5 = new JCheckBox("Python");
        i6 = new JCheckBox("React");

        i1.setBounds(140,180,40,30);
        i2.setBounds(180,180,50,30);
        i3.setBounds(240,180,60,30);
        i4.setBounds(140,210,70,30);
        i5.setBounds(210,210,70,30);
        i6.setBounds(290,210,70,30);

        i1.addItemListener(this);
        i2.addItemListener(this);
        i3.addItemListener(this);
        i4.addItemListener(this);
        i5.addItemListener(this);
        i6.addItemListener(this);

        c.add(i1);
        c.add(textArea2);
        c.add(i2);
        c.add(i3);
        c.add(i4);
        c.add(i5);
        c.add(i6);

//        JCheckBoxMenuItem

        menuBar =new JMenuBar();
        setting = new JMenu("Setting");
        box1 = new JCheckBoxMenuItem("Dark Mode ");
        box1.addItemListener(this);
        setting.add(box1);
        menuBar.add(setting);
        frame.setJMenuBar(menuBar);

    }
    @Override
    public void itemStateChanged(ItemEvent event) {
        String temp = comboBox.getSelectedItem().toString()+"   \n";
        String temp2 = "Selected : \n";
        textArea1.setText(temp);

        if (event.getSource() == male) {
            textArea1.setText(temp+"You selected male \n");
        }
        if (event.getSource() == female) {
            textArea1.setText(temp+"You selected female \n");
        }

        if (i1.isSelected()) {
            temp2+=i1.getText()+"\n";
            textArea2.setText(temp2);
        }if (i2.isSelected()) {
            temp2+=i2.getText()+"\n";
            textArea2.setText(temp2);
        }if (i3.isSelected()) {
            temp2+=i3.getText()+"\n";
            textArea2.setText(temp2);
        }if (i4.isSelected()) {
            temp2+=i4.getText()+"\n";
            textArea2.setText(temp2);
        }if (i5.isSelected()) {
            temp2+=i5.getText()+"\n";
            textArea2.setText(temp2);
        }if (i6.isSelected()) {
            temp2+=i6.getText()+"\n";
            textArea2.setText(temp2);
        }

        if (box1.isSelected()) {
            c.setBackground(Color.darkGray);
        }
        else{
            c.setBackground(Color.white);
        }





    }

}
public class ITEMLISTNER_PRACTICE {
    public static void main(String[] args) {
        B frame = new B();


    }
}
