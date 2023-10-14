package Project;

import javax.swing.*;
import java.awt.*;

public class L5_Buttons_and_cursor {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("L5");
        frame.setBounds(300, 500, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setBackground(Color.gray);
        c.setLayout(null);
        JButton button = new JButton("this is button ");
        button.setBounds(170,210,120,30);
        button.setBackground(Color.red);
        Font font = new Font("Times New Roman", Font.ITALIC, 14);

        button.setForeground(Color.white);
        button.setEnabled(true);
//        button.setVisible(false);
//        button.setVisible(true);
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Shantanu\\Downloads\\click.png");
        ImageIcon imageIcon1 = new ImageIcon("E:\\Code\\java\\Third\\src\\Project\\img.png");
        frame.setIconImage(imageIcon1.getImage());

        button.setIcon(imageIcon);
        button.setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());
        button.setFont(font);
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        button.setCursor(cursor);
        c.add(button);
        frame.setVisible(true);

    }
}
