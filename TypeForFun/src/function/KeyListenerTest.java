/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

/**
 *
 * @author NOC
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyListenerTest implements KeyListener, ActionListener {
    public static void main(String args[]) {
        new KeyListenerTest();
    }
    String str = "", int_to_str;
    String[] words = {"hello","world"};
    int score = 0, i = 0;

    JFrame frame;
    JTextField tf;
    JLabel lbl, show_word, show_scord;
    JButton btn;

    public KeyListenerTest() {
        frame = new JFrame();
        lbl = new JLabel();
        show_word = new JLabel();
        show_scord = new JLabel();
        tf = new JTextField(15);
        tf.addKeyListener(this);
        btn = new JButton("Clear");
        btn.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(tf);
        panel.add(btn);

        frame.setLayout(new BorderLayout());
        frame.add(lbl, BorderLayout.NORTH);
        frame.add(show_word);
        // frame.add(show_scord);
        frame.add(panel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        lbl.setText("You have typed "+ke.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        lbl.setText("You have pressed "+ke.getKeyChar());
        str += ke.getKeyChar();
        show_word.setText(words[i]);
        // int_to_str = Integer.toString(score);
        // show_scord.setText(int_to_str);
        if (str.equals(words[i])) {
            score++;
            System.out.println("score = "+score);
            i++;
            tf.setText("");
            str = "";
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        lbl.setText("You have released "+ke.getKeyChar());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        tf.setText("");
        str = "";
    }
}