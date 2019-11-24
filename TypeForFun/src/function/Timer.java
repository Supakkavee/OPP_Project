package function;

import function.Word;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Timer extends JLabel implements Runnable {

    private int sec = 0;
    
    public void run() {
        try {
            while (true) {
                sec--;
                if (sec == -1) {
                    sec = 10;
                }
                setText(String.format("%02d", sec));
                Thread.sleep(1000);
                
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
