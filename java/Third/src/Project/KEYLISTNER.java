package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KEYLISTNER {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("KEYLISTNER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);

    }
}

class MyFrame extends JFrame implements KeyListener {
    Container c;
    JTextArea textArea;
    JLabel label;
    public MyFrame() {
        setTitle("KeyListner");
        textArea = new JTextArea(5,20);
        textArea.setBounds(40,40,320,420);
        textArea.addKeyListener(this);
        c = getContentPane();
        c.setLayout(null);
        label = new JLabel();
        label.setBounds(380,40,120,120);
        c.add(label);
        c.add(textArea);

    }
@Override
    public void keyPressed(KeyEvent event) {
        textArea.setText("");
    }
    @Override
    public void keyReleased(KeyEvent event) {
        String t=label.getText();
        t+=event.getKeyChar();
        label.setText(t);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        textArea.setText(label.getText());
    }
}
