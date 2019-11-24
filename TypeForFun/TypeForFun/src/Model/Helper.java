package Model;

import java.awt.*;
import javax.swing.*;
public class Helper{

    public static JLabel createTitleLabel(String t){
        JLabel l = new JLabel(t);
        l.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 90));
        l.setOpaque(false);
        return l;
    }
    public static JLabel createLabel(String t){
        JLabel l = new JLabel(t);
        l.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
        l.setForeground(Color.red);
        l.setOpaque(false);
        return l;
    }

    public static JTextField createTextField(int size){
        JTextField f = new JTextField(size);
        f.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
        //f.setOpaque(false);
        f.requestFocusInWindow();
        f.setForeground(Color.white);
        f.setBackground(Color.black);
        f.setHorizontalAlignment(JTextField.CENTER);
        return f;
    }
    
    public static JButton createButton(String t){
        JButton B = new JButton(t);
        B.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
        B.setForeground(Color.white);
        B.setBackground(Color.black);
        return B;
    }
    public static JTextArea createTextArea(String t){
        JTextArea A = new JTextArea(t);
        A.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
        A.setForeground(Color.white);
        A.setBackground(Color.black);
        return A;
    }
    public static JProgressBar createJProgressBar(int hp){
        JProgressBar b = new JProgressBar(0, hp);
        b.setStringPainted(true);
        b.setForeground(Color.red);
        b.setBackground(Color.black);
        b.setPreferredSize(new Dimension(300, 30));
        b.setValue(hp);
        return b;
    }
}