package function;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameM extends JFrame implements KeyListener, ActionListener {

    String str = "", int_to_str, str_ran;
    char s;
    // String[] words = {"hello", "world", "samsung"};

    public int score = 0, i = 0, hp = 100;

    JTextField tf, tf2;
    JLabel lbl, show_word_m, show_scord, show_hp, show_word_p;
    JButton btn;
    Timer t = new Timer();
    JPanel panel, panel1;
    Word w = new Word();
    // Thread tr = new Thread(t);

    public static void main(String args[]) {
        new GameM().init();
    }
    public void init() {
        Thread tr = new Thread(t);
        setLayout(null);

        //panel1
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5,1));
        lbl = new JLabel("LBL");
        show_word_m = new JLabel();
        show_word_p = new JLabel();
        show_scord = new JLabel("show_scord");
        show_hp = new JLabel("show_hp");
        //add panel1
        panel1.add(lbl);
        panel1.add(show_hp);
        panel1.add(show_word_m);
        panel1.add(show_scord);
        panel1.add(show_word_p);
        panel1.setBounds(500, 100, 300, 500);
        add(panel1);

        panel1.add(t);
        //panel
        panel = new JPanel();
        panel.setBounds(500, 600, 400, 150);
        panel.setBackground(Color.yellow);

        tf = new JTextField(15);
        panel.addKeyListener(this);
        btn = new JButton("Clear");
        btn.addActionListener(this);
        // panel.add(tf);
        panel.add(btn);
        add(panel);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        // tf.setSize(100, 25);

        panel.setFocusable(true);

        /*t.setFont(new Font("Courier", Font.BOLD, 100)); // << set font ของเวลา
        show_word.setFont(new Font("Courier", Font.BOLD, 100));// << set font ของคำ
        show_scord.setFont(new Font("Courier", Font.BOLD, 100));// << set font ของคะแนน
        show_hp.setFont(new Font("Courier", Font.BOLD, 100));// << set font ของเลือด*/

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600, 900);
        setVisible(true);

        tr.start();

        str_ran = w.getRandom(w.getWord());

        int_to_str = Integer.toString(score);
        show_scord.setText("score = " + int_to_str);

        int_to_str = Integer.toString(hp);
        show_hp.setText("HP = " + int_to_str);

        show_word_m.setText(str_ran);

    }

    @Override
    public void keyTyped(KeyEvent ke) {
        lbl.setText("You have typed " + ke.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent ke) { // กรณี key ลงไป
        lbl.setText("You have pressed " + ke.getKeyChar());
        s = ke.getKeyChar();

        if (Character.toString(s).matches(".*[a-zA-Z].*")) // บอกว่าให้ a-z A-Z พิมได้เท่านั้น
            str += ke.getKeyChar();

        if (ke.getKeyChar() == 8 && str != null && str.length() > 0) // Blackspace ลบตัวสุดท้ายออกไป
            str = str.substring(0, str.length() - 1);

        System.out.println(str.equals(str_ran) + " " + str + " " + str_ran + " ");

    }

    @Override
    public void keyReleased(KeyEvent ke) { // กรณี key ขึ้นมา
        lbl.setText("You have released " + ke.getKeyChar());
        if (str.equals(str_ran)) { // << กรณีพิมพ์ถูก
            score++;
            System.out.println("score = " + score);
            str = "";
            // tf.setText(str);
            hp += 10;
            str_ran = w.getRandom(w.getWord());
            t.setTime(0);
        }
        if (str.length() == str_ran.length()) { // << กรณีพิมพ์ผิด และจำนวนตัวอักษรเท่ากัน
            hp -= 20;
        }

        int_to_str = Integer.toString(score);
        show_scord.setText("score = " + int_to_str);

        int_to_str = Integer.toString(hp);
        show_hp.setText("HP = " + int_to_str);

        show_word_m.setText(str_ran);
        show_word_p.setText(str);
        System.out.println(hp);

    }

    @Override
    public void actionPerformed(ActionEvent ae) { // << กรณีกด clear
        str = "";
        tf.setText(str);
    }
    public void setHp(int p) {
        hp -= p;
        int_to_str = Integer.toString(hp);
        show_hp.setText("HP = " + int_to_str);
    }
    public void changeWord() {
        str_ran = w.getRandom(w.getWord());
        show_word_m.setText(str_ran);
    }

}
