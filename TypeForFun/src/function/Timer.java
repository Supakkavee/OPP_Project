package function;


import function.Word;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Timer extends JPanel implements Runnable {

    Word w = new Word();
    public int sec = 0;
    JLabel time, l;

    public void run() {
        try {
            setLayout(new GridLayout(1,2));
            time = new JLabel();
            l = new JLabel();

            add(time);
            add(l);
            while (true) {
                if (sec <= 0) {
                    // l.setText(w.getRandom(w.getWord()));
                    // l.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
                    sec = 15;
                    // new GameM().setHp(30);    << ทำแบบนี้แล้วค้าง
                    // new GameM().changeWord(); << ทำแบบนี้แล้วค้าง
                }
                time.setFont(new Font("Serif", Font.PLAIN, 30));
                time.setText(String.format("%02d", sec));
                Thread.sleep(1000);
                sec--;
            }
        } catch (Exception ex) {
        }

    }
    public void setTime(int t) {
        this.sec = t;
    }

    public int getTime() {
        return sec;
    }

}
