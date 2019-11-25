package function;

import static Model.Helper.createJProgressBar;
import static Model.Helper.createLabel;
import static Model.Helper.createTextField;
import View.BgPanel;
import View.GameOver;
import View.SoundEffect;
import View.win;
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
    private JPanel gameover;
    private int state = 1;
    private JPanel winner = new win();
    BgPanel bg = new BgPanel(new ImageIcon("img/background3.png").getImage());
    BgPanel Boss = new BgPanel(new ImageIcon("img/Monster3.png").getImage());
    BgPanel bg2 = new BgPanel(new ImageIcon("img/background4.png").getImage());
    BgPanel Boss2 = new BgPanel(new ImageIcon("img/Monster.png").getImage());
    BgPanel bg3 = new BgPanel(new ImageIcon("img/backgroundGame.png").getImage());
    BgPanel Boss3 = new BgPanel(new ImageIcon("img/Monster2.png").getImage());
    Shoot s = new Shoot();

    public GamePlay(String img) {
        setLayout(null);
        repaint();
        revalidate();
        //shoot
        s.setBounds(400, 450, 500, 50);
        s.setVisible(false);
        add(s);
        //Player
        BgPanel Player = new BgPanel(new ImageIcon(img).getImage());
        Player.setBounds(100, 330, 246, 302);
        bg.add(Player);
        gameover = new GameOver(img);

        HpPlayer = createJProgressBar(1000);
        HpPlayer.setBounds(100, 50, 300, 30);
        bg.add(HpPlayer);

        DAtk1 = createLabel("");
        DAtk1.setBounds(220, 280, 100, 30);
        bg.add(DAtk1);
        //HP Boss
        HpBoss = createJProgressBar(1000);
        HpBoss.setBounds(880, 50, 300, 30);
        bg.add(HpBoss);

        Boss.setBounds(780, 220, 500, 460);
        bg.add(Boss);

        DAtk2 = createLabel("");
        DAtk2.setBounds(900, 200, 100, 30);
        bg.add(DAtk2);
        //Panel
        BgPanel Wordp = new BgPanel(new ImageIcon("img/Word.png").getImage());
        Wordp.setBounds(490, 50, 300, 100);
        Wordp.setLayout(new GridLayout(2,1));
        bg.add(Wordp);
        //Text
        Text = createTextField(50);
        Text.setBounds(490, 600, 300, 50);
        bg.add(Text);

        //Countdown time for word
        Ti.setForeground(Color.black);
        Ti.setHorizontalAlignment(JLabel.CENTER);
        Ti.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 40));
        Wordp.add(Ti);
        tTi.start();
        //Word random
        setWordAtk(w.getRandom(w.getWord()));
        WordL = new JLabel(getWordAtk());
        WordL.setForeground(Color.black);
        WordL.setHorizontalAlignment(JLabel.CENTER);
        WordL.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 40));
        Wordp.add(WordL);

        add(bg);
        //ActionListener
        Text.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        SoundEffect se = new SoundEffect();
        if (Text.getText().equals(getWordAtk())) {
            //shoot
            s.setVisible(true);
            s.setX();
            //Damage Player
            HpBoss.setValue(HpBoss.getValue() - AtkP);
            Db = "t";
            //voice Atk Player
            se.setFile(".//Music//shotgun.wav");
            se.play();
        } else {
            //voice Atk Boss
            se.setFile(".//Music//Button.wav");
            se.play();
            HpPlayer.setValue(HpPlayer.getValue() - AtkB);
        }
        if (state == 1) {
            Ti.setTime(11);// set defualt time 
        }
        if (state == 2) {
            Ti.setTime(8);// set defualt time 
        }
        if (state == 0) {
            Ti.setTime(6);// set defualt time 
        }
        setWordAtk(w.getRandom(w.getWord()));
        WordL.setText(getWordAtk());
        Text.setText("");
    }

    public void run() {
        try {
            SoundEffect bs = new SoundEffect();
            SoundEffect mu = new SoundEffect();
            boolean running = true;
            mu.setFile(".//Music//time.wav");
            mu.play();
            mu.loop(1000);
            while (running) {
                if (HpPlayer.getValue() <= 0) {
                    //setVisible(false);
                    mu.stop();
                    
                    removeAll();
                    revalidate();
                    running = false;
                    setLayout(new BorderLayout());
                    add(gameover);
                    repaint();
                }
                //hp Boss = 0
                if (HpBoss.getValue() <= 0 && state == 1) {
                    bg.remove(bg);
                    bg.remove(Boss);
                    bg.add(Boss2);
                    bg.add(bg2);
                    AtkB += 100;
                    HpBoss.setMaximum(1500);
                    HpBoss.setValue(1500);
                    Boss2.setBounds(780, 220, 500, 460);
                    Ti.setTime(8);
                    repaint();
                    state = 2;
                }
                if (HpBoss.getValue() <= 0 && state == 2) {
                    bg.remove(bg2);
                    bg.remove(Boss2);
                    bg.add(Boss3);
                    bg.add(bg3);
                    AtkB += 100;

                    HpBoss.setMaximum(2000);
                    HpBoss.setValue(2000);
                    Boss3.setBounds(780, 220, 500, 460);
                    Ti.setTime(6);
                    repaint();
                    state = 0;
                }
                if (HpBoss.getValue() <= 0 && state == 0) {
                    mu.stop();
                    removeAll();
                    revalidate();
                    running = false;

                    setLayout(new BorderLayout());
                    add(winner);
                    repaint();
                }
                Thread.sleep(1000);
                if (Ti.getTime() == 0) {
                    if (state == 2) {
                        Ti.setTime(8);
                    } else if (state == 0) {
                        Ti.setTime(6);
                    }

                    //voice Atk Boss
                    bs.setFile(".//Music//Button.wav");
                    bs.play();
                    Text.setText("");
                    setWordAtk(w.getRandom(w.getWord()));
                    WordL.setText(getWordAtk());
                    HpPlayer.setValue(HpPlayer.getValue() - AtkB);
                    DAtk1.setText("-" + AtkB + "!");
                    Thread.sleep(1000);
                    DAtk1.setText("");
                }

                if (Db.equals("t")) {
                    Thread.sleep(250);
                    Db = "f";
                    DAtk2.setText("-" + AtkP + "!");
                    Thread.sleep(1000);
                    DAtk2.setText("");
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
