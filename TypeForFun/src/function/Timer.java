
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Timer extends JPanel implements Runnable {

    Word w = new Word();
    private int sec = 0;
    JLabel time, l;

    public void run() {
        try {
            setLayout(null);
            time = new JLabel();
            l = new JLabel();

            time.setBounds(150, 100, 100, 100);
            l.setBounds(150, 200, 100, 100);

            add(time);
            // add(l);
            while (true) {
                if (sec == 0) {
                    // l.setText(w.getRandom(w.getWord()));
                    l.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
                    sec = 15;
                }
                time.setFont(new Font("Serif", Font.PLAIN, 30));
                time.setText(String.format("%02d", sec));
                Thread.sleep(1000);
                sec--;

            }
        } catch (Exception ex) {
        }
    }



}
