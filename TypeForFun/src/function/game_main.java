
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class game_main implements KeyListener, ActionListener {


    public static void main(String args[]) {
        new game_main().init();
    }
    String str = "", int_to_str;
    char s;
    String[] words = {"hello", "world", "samsung"};
    int score = 0, i = 0, hp = 100;

    JFrame frame;
    JTextField tf, tf2;
    JLabel lbl, show_word, show_scord, show_hp;
    JButton btn;

    Timer t = new Timer();

    public void init() {
        Thread tr = new Thread(t);
        JPanel panel = new JPanel();

        frame = new JFrame();
        lbl = new JLabel();
        show_word = new JLabel();
        show_scord = new JLabel();
        show_hp = new JLabel();
        tf = new JTextField(15);
        tf.addKeyListener(this);
        btn = new JButton("Clear");
        btn.addActionListener(this);


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
        frame.add(t); // << ใส่เวลาเข้าไป ซึ่งยังใส่ไม่ได้ <<<<<<< ฝากดูหน่อย
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 900);
        frame.setVisible(true);

        t.setFont(new Font("Courier", Font.BOLD,100)); // << set font ของเวลา
        show_word.setFont(new Font("Courier", Font.BOLD,100));// << set font ของคำ
        show_scord.setFont(new Font("Courier", Font.BOLD,100));// << set font ของคะแนน
        show_hp.setFont(new Font("Courier", Font.BOLD,100));// << set font ของเลือด

        show_word.setText(words[i]);
        // t.start();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        lbl.setText("You have typed "+ke.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent ke) { // กรณี key ลงไป
        lbl.setText("You have pressed "+ke.getKeyChar());
        s = ke.getKeyChar();
        if (Character.toString(s).matches(".*[a-z].*")){ // บอกว่าให้ a-z พิมได้เท่านั้น
            str += ke.getKeyChar();
        }
        if (ke.getKeyChar() == 8 && str != null && str.length() > 0) // Blackspace ลบตัวสุดท้ายออกไป
            str = str.substring(0, str.length() - 1);

        System.out.println(str.equals(words[i])+" "+str+" "+words[i]+" ");
    }

    @Override
    public void keyReleased(KeyEvent ke) { // กรณี key ขึ้นมา
        lbl.setText("You have released "+ke.getKeyChar());
        if (str.equals(words[i])) { // << กรณีพิมพ์ถูก
            score++;
            System.out.println("score = "+score);
            i++;
            str = "";
            tf.setText(str);
            hp += 10;

        }
        if (str.length() == words[i].length()) { // << กรณีพิมพ์ผิด และจำนวนตัวอักษรเท่ากัน
            hp -= 20;
        }

        int_to_str = Integer.toString(score);
        show_scord.setText("score = "+int_to_str);

        int_to_str = Integer.toString(hp);
        show_hp.setText("HP = "+int_to_str);

        show_word.setText(words[i]);

    }

    @Override
    public void actionPerformed(ActionEvent ae) { // << กรณีกด clear
        str = "";
        tf.setText(str);
    }
}