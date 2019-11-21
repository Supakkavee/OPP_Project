
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test implements KeyListener, ActionListener{

    Timer t = new Timer();

    String str = "", int_to_str;
    char s;
    // String[] words = {"hello", "world", "samsung"};
    int score = 0, i = 0, hp = 100;

    JTextField tf;
    JFrame fr = new JFrame();
    Thread tr = new Thread(t);
    JButton btn;

    private void init() {

        tf = new JTextField(15);
        tf.addKeyListener(this);
        btn = new JButton("Clear");
        btn.addActionListener(this);

        tr.start();
        fr.setSize(400, 400);
        fr.setVisible(true);
        fr.add(t);
        fr.add(tf);
        fr.add(btn);

    }

    public static void main(String[] args) {
        new Test().init();
    }

     @Override
    public void keyTyped(KeyEvent ke) {
        // lbl.setText("You have typed "+ke.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        // lbl.setText("You have pressed "+ke.getKeyChar());
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
        // lbl.setText("You have released "+ke.getKeyChar());
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
            time.setFont(new Font("Courier", Font.BOLD,100));
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
