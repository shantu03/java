package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class lable  implements ActionListener{
    JLabel label;
    JTextField textField;
    JButton button;


    public lable(JFrame frame) {
        label = new JLabel();
        label.setBounds(70,200,80,70);
        textField = new JTextField();

        textField.setBounds(40,50,150,30);
        button = new JButton("show");
        button.setBounds(60, 80, 70, 30);
        button.addActionListener(this);

        label.setBackground(Color.DARK_GRAY);
        frame.setBackground(Color.gray);
        button.setBackground(Color.lightGray);
        textField.setBackground(Color.pink);

        label.add(button);
        label.add(textField);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name =textField.getText();
        label.setText("Welcome  "+ name);
    }
}
class CardLayout_eg extends JFrame implements ActionListener {
    CardLayout crd;
    JButton button1,button2,button3;
    Container cPane;
    public CardLayout_eg(JFrame frame) {
        cPane = frame.getContentPane();

        crd = new CardLayout(15,23);
        frame.setTitle("Edited Title");
        cPane.setLayout(crd);
        button1 = new JButton("first");
        button2 = new JButton("second");
        button3 = new JButton("third");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        cPane.add("a", button1);
        cPane.add("b", button2);
        cPane.add("c", button3);

    }

    public void actionPerformed(ActionEvent e) {
        crd.next(cPane);
    }
}
public class Learning {
    static void trying(JFrame frame) {

        JButton button = new JButton("Button Title");
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        button.setBounds(10, 60, 30, 20);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    static void menuBar(JFrame frame) {
        frame.setTitle("MenuBar method frame");
    JMenuBar menuBar=new JMenuBar();
        JMenu menu = new JMenu("Shantanu");
        JMenu menu1 = new JMenu("Raviraj");

        JMenuItem item = new JMenuItem("Dob");
        JMenuItem item1 = new JMenuItem("29/08/03");
        menu.add(item1);

        JMenuItem item2 = new JMenuItem("sdaf");

        menu.add(item);
        menu1.add(item2);
        menuBar.add(menu);
        menuBar.add(menu1);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);


    }

    static void jlabel(JFrame frame) {
//        LABEL IS SO DAMN CONFUSING
        JLabel label1 = new JLabel("First L");
        JLabel label2 = new JLabel("Second L");

        label1.setBounds(0,0,50,30);
        label2.setBounds(0, 0, 150, 30);
        label1.setBackground(Color.RED);
        label2.setBackground(Color.GREEN);
        JMenuBar jmEnuBar = new JMenuBar();
        JMenu menu = new JMenu("This is slilli");
        JMenu menu1 =new JMenu("jasdkl");
        label2.add(menu1);
        label1.add(menu);
        frame.add(label1);
        frame.add(label2);

        frame.setVisible(true);
    }


    static void BorderLayout(JFrame frame) {

        JButton button = new JButton("Button 1");
        JButton button1 = new JButton("Button 2");
        JButton button2 = new JButton("Button 3");
        JButton button3 = new JButton("Button 4");
        JButton button4 = new JButton("Button 5 ");

        frame.setLayout(new BorderLayout(7,7));
        button3.setBounds(7, 2, 12, 32);
        frame.add(button4, BorderLayout.SOUTH);
//        frame.add(button3);
        frame.add(button3, BorderLayout.CENTER);
        frame.add(button, BorderLayout.NORTH);
        frame.add(button1, BorderLayout.WEST);
        frame.add(button2, BorderLayout.EAST);


    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Title");
        frame.setSize(500, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        trying(frame);
//        BorderLayout(frame);
//        CardLayout_eg obj = new CardLayout_eg(frame);
//        menuBar(frame);
//        jlabel(frame);

        new lable(frame);

    }

}
