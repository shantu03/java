package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class red implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event) {
        L6_ActionListener.c.setBackground(Color.red);
        System.out.println("RED Using outer class with public static Container");
    }
}
class green implements  ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        L6_ActionListener.c.setBackground(Color.green);
        System.out.println(" GREEN Using outer class with public static Container");
    }
}

public class L6_ActionListener  {
    public static Container c;
    public static void main(String[] args) {
        JFrame frame = new JFrame("L6");
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);

        ImageIcon frameimg = new ImageIcon("E:\\Code\\java\\Third\\src\\Project\\img.png");
        frame.setIconImage(frameimg.getImage());
         c = frame.getContentPane();


        c.setLayout(null);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Shantanu\\Downloads\\click.png");
        JButton button = new JButton("RED");
        button.setLocation(50,50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setSize(100,30);
        JButton button1 = new JButton("GREEN");
        button1.setBounds(200,50,100,30);
        JButton button2 = new JButton("YELLOW");
        button2.setBounds(350,50,100,30);
        button.addActionListener(new red());
        button1.addActionListener(new green());
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {
                c.setBackground(Color.yellow);
                System.out.println("Yellow color using anonymous class");
            }
        });


        c.add(button2);
        c.add(button1);
        c.add(button);






        frame.setVisible(true);


    }
}
