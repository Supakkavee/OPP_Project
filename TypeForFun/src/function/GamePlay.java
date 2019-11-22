package function;

import static Model.Helper.createLabel;
import static Model.Helper.createTextField;
import View.BgPanel;
import function.Word;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePlay extends JPanel implements Runnable, ActionListener {

    private Timer Ti = new Timer();
    private Word w = new Word();
    private Thread tTi = new Thread(Ti);
    private int sec = 0, AtkP = 100, AtkB = 200;
    private JProgressBar HpPlayer, HpBoss;
    private JTextField Text;
    private String WordAtk, Db = "f";
    private JLabel WordL, DAtk1, DAtk2;
    BgPanel bg = new BgPanel(new ImageIcon("img/backgroundGame.png").getImage());
    BgPanel Boss = new BgPanel(new ImageIcon("img/Monster2.png").getImage());

    public GamePlay(String img) {
        repaint();
        revalidate();
        //setLayout(null);
        BgPanel Player = new BgPanel(new ImageIcon(img).getImage());
        Player.setBounds(100, 330, 246, 302);
        bg.add(Player);

        HpPlayer = new JProgressBar(0, 1000);
        HpPlayer.setBounds(100, 50, 300, 30);
        HpPlayer.setStringPainted(true);
        HpPlayer.setForeground(Color.red);
        HpPlayer.setBackground(Color.black);
        HpPlayer.setPreferredSize(new Dimension(300, 30));
        HpPlayer.setValue(1000);
        bg.add(HpPlayer);

        DAtk1 = createLabel("");
        DAtk1.setBounds(220, 280, 100, 30);
        bg.add(DAtk1);
        //HP Boss
        HpBoss = new JProgressBar(0, 1000);
        HpBoss.setBounds(880, 50, 300, 30);
        HpBoss.setStringPainted(true);
        HpBoss.setForeground(Color.red);
        HpBoss.setBackground(Color.black);
        HpBoss.setPreferredSize(new Dimension(300, 30));
        HpBoss.setValue(1000);
        bg.add(HpBoss);
        Boss.setBounds(780, 220, 500, 460);
        bg.add(Boss);

        DAtk2 = createLabel("");
        DAtk2.setBounds(900, 200, 100, 30);
        bg.add(DAtk2);
        //Text
        Text = createTextField(50);
        Text.setBounds(490, 600, 300, 50);
        Text.setForeground(Color.white);
        Text.setBackground(Color.black);
        bg.add(Text);

        //Countdown time for word
        Ti.setBounds(600, 50, 50, 30);
        Ti.setForeground(Color.yellow);
        Ti.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 40));
        bg.add(Ti);
        tTi.start();
        //Word random
        setWordAtk(w.getRandom(w.getWord()));
        WordL = new JLabel(getWordAtk());
        WordL.setForeground(Color.yellow);
        WordL.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 40));
        WordL.setBounds(580, 150, 300, 50);
        bg.add(WordL);

        add(bg);
        //ActionListener
        Text.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (Text.getText().equals(getWordAtk())) {
            HpBoss.setValue(HpBoss.getValue() - AtkP);
            Db = "t";
        } else {
            HpPlayer.setValue(HpPlayer.getValue() - AtkB);
        }
        Ti.setTime(10);// set defualt time 
        setWordAtk(w.getRandom(w.getWord()));
        WordL.setText(getWordAtk());
        Text.setText("");
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                //if time = 0 setdefualt hp down
                if (Ti.getTime() == 0) {
                    setWordAtk(w.getRandom(w.getWord()));
                    WordL.setText(getWordAtk());
                    HpPlayer.setValue(HpPlayer.getValue() - AtkB);
                    DAtk1.setText("-" + AtkB + "!");
                    Thread.sleep(1000);
                    DAtk1.setText("");
                }
                if (Db.equals("t")) {
                    Db = "f";
                    DAtk2.setText("-" + AtkP + "!");
                    Thread.sleep(1000);
                    DAtk2.setText("");
                }

                if (HpPlayer.getValue() <= 0) {
                    //setVisible(false);
                    removeAll();
                    repaint();
                    revalidate();
                }
                //hp Boss = 0
                if (HpBoss.getValue() <= 0) {
                    removeAll();
                    repaint();
                    revalidate();
                }
            }
        } catch (Exception ex) {
        }
    }

    public String getWordAtk() {
        return WordAtk;
    }

    public void setWordAtk(String WordAtk) {
        this.WordAtk = WordAtk;
    }
}
