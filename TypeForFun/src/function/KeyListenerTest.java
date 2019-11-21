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
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerTest implements KeyListener, ActionListener {
    public static void main(String args[]) {
        new KeyListenerTest();
    }
    String str = "", int_to_str;
    char s;
    String[] words = {"hello", "world", "samsung"};
    int score = 0, i = 0, hp = 100;

    JFrame frame;
    JTextField tf, tf2;
    JLabel lbl, show_word, show_scord, show_hp;
    JButton btn;
    MyClock time = new MyClock();
    Thread t1 = new Thread(time);

    public KeyListenerTest() {
        frame = new JFrame();
        lbl = new JLabel();
        show_word = new JLabel();
        show_scord = new JLabel();
        show_hp = new JLabel();
        tf = new JTextField(15);
        tf.addKeyListener(this);
        tf2 = new JTextField(15);
        btn = new JButton("Clear");
        btn.addActionListener(this);
        JPanel panel = new JPanel();

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        frame.pack();
        // frame.setLocationRelativeTo(null);
        tf.setSize(100, 25);

        panel.add(tf);
        panel.add(btn);

        frame.setLayout(new GridLayout(5, 1));
        frame.add(lbl);
        frame.add(show_hp);
        frame.add(show_word);
        frame.add(show_scord);
        frame.add(time);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 900);
        frame.setVisible(true);

        time.setFont(new Font("Courier", Font.BOLD,100));
        show_word.setFont(new Font("Courier", Font.BOLD,100));
        show_scord.setFont(new Font("Courier", Font.BOLD,100));
        show_hp.setFont(new Font("Courier", Font.BOLD,100));

        show_word.setText(words[i]);
        t1.start();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        lbl.setText("You have typed "+ke.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        lbl.setText("You have pressed "+ke.getKeyChar());
        s = ke.getKeyChar();
        if (Character.toString(s).matches(".*[a-z].*")){
            str += ke.getKeyChar();
        }
        if (ke.getKeyChar() == 8 && str != null && str.length() > 0) // Blackspace
            str = str.substring(0, str.length() - 1);
        System.out.println(str.equals(words[i])+" "+str+" "+words[i]+" ");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        lbl.setText("You have released "+ke.getKeyChar());
        if (str.equals(words[i])) {
            score++;
            System.out.println("score = "+score);
            i++;
            str = "";
            tf.setText(str);
            hp += 10;
            t1.stop();
            MyClock time = new MyClock();
            Thread t1 = new Thread(time);
            t1.start();
            frame.getContentPane().remove(time);
            frame.getContentPane().add(time);
            frame.invalidate();
            frame.validate();
        }
        if (str.length() == words[i].length()) {
            hp -= 20;
        }

        int_to_str = Integer.toString(score);
        show_scord.setText("score = "+int_to_str);

        int_to_str = Integer.toString(hp);
        show_hp.setText("HP = "+int_to_str);

        show_word.setText(words[i]);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        str = "";
        tf.setText(str);
    }
}