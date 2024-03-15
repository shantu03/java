package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class registerForm extends JFrame {
    Container c;
    String date[];
    public registerForm()
    {
        date = new String[3];
        c = getContentPane();
        c.setLayout(null);
        JLabel label=new JLabel("Registration Form");
        Font font = new Font("Times New Roman", Font.BOLD, 20);
        label.setFont(font);
        Font font1=new Font("Arial",Font.BOLD,15);
        Font font2=new Font("Arial",Font.PLAIN,15);
        label.setBounds(250,30,220,30);
        JLabel name = new JLabel("Name");
        name.setBounds(40, 90, 60, 30);
        JLabel mobile = new JLabel("Mobile");
        mobile.setBounds(40,140,70,30);
        JLabel gender = new JLabel("Gender");
        gender.setBounds(40,190,70,30);
        JLabel dob = new JLabel("DOB");
        dob.setBounds(40,240,40,30);
        JLabel address = new JLabel("Address");
        address.setBounds(40,290,80,30);

        JLabel status = new JLabel("");

        name.setFont(font1);
        mobile.setFont(font1);
        gender.setFont(font1);
        dob.setFont(font1);
        address.setFont(font1);

        JTextField namefield,mobilefield;
        namefield = new JTextField();
        namefield.setBounds(140,90,240,30);
        mobilefield = new JTextField();
        mobilefield.setBounds(140,140,240,30);


        JRadioButton m,f;
        m = new JRadioButton("Male");
        f = new JRadioButton("Female");
        m.setBounds(140,190,70,30);
        f.setBounds(210,190,90,30);
        ButtonGroup k=new ButtonGroup();
        k.add(m);
        k.add(f);

        String[] days = new String[32];
        days[0] = "dd";
        for (int i = 1; i <=31 ; i++) {
            days[i]=""+i;
        }
        String []months={"mm","JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","NOV","DEC"};

        String[] years = new String[51];
        years[0] = "yyyy";

        for (int i = 50; i > 0; i--) {
            years[i]=""+(2023-i);
        }



        JComboBox<String> day = new JComboBox<>(days);
        day.setBounds(140,240,50,30);
        JComboBox<String> month = new JComboBox<>(months);
        month.setBounds(200,240,70,30);
        JComboBox<String> year = new JComboBox<>(years);
        year.setBounds(290,240,80,30);
        day.addItemListener(e -> date[0]=day.getSelectedItem().toString());
        month.addItemListener(e -> date[1]=month.getSelectedItem().toString());
        year.addItemListener(e -> date[2]=year.getSelectedItem().toString());

        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(140,290,240,70);


        JCheckBox term = new JCheckBox("Please accept terms and condition's ");
        term.setBounds(100,380,310,30);


        JButton submit = new JButton("SUBMIT");
        submit.setBounds(185,430,100,30);
        submit.setEnabled(false);
        term.addActionListener(e -> submit.setEnabled(true));




        JTextArea form = new JTextArea("DATA:\n");
        form.setBounds(420,90,250,400);
        form.setEditable(false);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = "";
                temp+=name.getText()+" : "+namefield.getText()+"\n\n";
                temp+=mobile.getText()+" : "+mobilefield.getText()+"\n\n";
                if (m.isSelected()) {
                    temp+=gender.getText()+" : "+m.getText()+"\n\n";
                }if (f.isSelected()) {
                    temp+=gender.getText()+" : "+f.getText()+"\n\n";
                }
                temp += dob.getText() + " : " + date[0] + "-" + date[1] + "-" + date[2] + "\n\n";

                temp += address.getText() + " : " + addressArea.getText() + "\n\n";

                


                form.setText(temp);
            }
        });

        submit.setFont(new Font(font2.getFontName(),Font.BOLD,15));
        term.setFont(new Font(font2.getFontName(),Font.BOLD,15));
        addressArea.setFont(font2);
        namefield.setFont(font2);
        mobilefield.setFont(font2);
        m.setFont(font2);
        f.setFont(font2);
        day.setFont(font2);
        month.setFont(font2);
        year.setFont(font2);
        c.add(year);
        c.add(submit);
        c.add(addressArea);
        c.add(form);
        c.add(term);
        c.add(day);
        c.add(month);
        c.add(label);
        c.add(m);
        c.add(name);
        c.add(namefield);
        c.add(mobilefield);
        c.add(mobile);
        c.add(gender);
        c.add(dob);
        c.add(m);
        c.add(f);
        c.add(address);


    }
    public static void main(String[] args) {
        registerForm frame=new registerForm();
        frame.setSize(700,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
