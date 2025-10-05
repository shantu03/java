import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
public class pra extends JFrame {
    JTextField ageField;
    JTextField incomeField;
    // JTextField marurityField;
    JTextField typeField;
    JTextField lumpsum;
    JTextField sip;

    JLabel lum;
    JLabel sipla;
    JLabel agelabel;
    JLabel incomelabel;
    JLabel maturitylabel;
    JLabel typelabel;


    Container c;
    pra(){
        setTitle("practice ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        ageField=new JTextField(10);
        agelabel=new JLabel("Age : ") ;
        agelabel.setBounds(10,40,60,20);
        ageField.setBounds(140, 40, 90, 20);


        incomeField =new JTextField(10);
        incomelabel =new JLabel("Inome/Month :");
        incomelabel.setBounds(10,60,120,20);
        incomeField.setBounds(140,60,100,20);
        
        maturitylabel=new JLabel("Maturity in yrs ");
        maturitylabel.setBounds(10, 80, 130, 20);


        sipla =new JLabel("SIP Ammount :");
        sip =new JTextField("0");
        sipla.setBounds(10,140,100,20);
        sip.setBounds(140,140,100,20);
        Integer m[]=new Integer[10];
        for (int i = 0; i < m.length; i++) {
            m[i]=i+1;
        }
        
        JComboBox<Integer> maturityBox=new JComboBox<>(m);
        maturityBox.setBounds(140,80,60,20);
        c=getContentPane();
        c.setLayout(null);
        c.add(agelabel);


        JLabel la = new JLabel("Ready to Invest");
        la.setBounds(10, 110, 180, 20);
        la.setFont(new Font("Arial",Font.BOLD,15))       ;
        la.setForeground(Color.BLUE);

        lum=new JLabel("Lumpsum :");
        lum.setBounds(10, 160, 100, 20);

        lumpsum =new JTextField("0");
        lumpsum.setBounds(140,160,100,20);

        c.add(lum);
        c.add(lumpsum); 
        c.add(la);
        c.add(sip);
        c.add(sipla);
        c.add(ageField);
        c.add(incomelabel);
        c.add(maturityBox);
        c.add(maturitylabel);
        c.add(incomeField);

    }
    public static void main(String[] args) {
        new pra().setVisible(true);
    }
}
