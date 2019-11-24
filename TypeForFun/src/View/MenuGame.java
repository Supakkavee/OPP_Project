package View;

import Model.Helper;
import function.GamePlay;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuGame extends JPanel implements MouseListener {

    private BgPanel bg = new BgPanel(new ImageIcon("img/character.png").getImage());
    private BgPanel s1 = new BgPanel(new ImageIcon("img/select.png").getImage());
    private BgPanel s2 = new BgPanel(new ImageIcon("img/select.png").getImage());
    private BgPanel s3 = new BgPanel(new ImageIcon("img/select.png").getImage());
    private static SoundEffect se = new SoundEffect();

    public MenuGame() {

        setLayout(null);

        s1.setBounds(160, 550, 168, 80);
        s1.addMouseListener(this);

        s2.setBounds(550, 550, 168, 80);
        s2.addMouseListener(this);

        s3.setBounds(940, 550, 168, 80);
        s3.addMouseListener(this);

        bg.add(s1);
        bg.add(s2);
        bg.add(s3);
        add(bg);
        se.setFile(".//Music//intro.wav");
        se.play();
        se.loop(100);

        setLocation(0, 0);

    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
        removeAll();

        se.stop();
        if (me.getSource().equals(s1)) {
            GamePlay g = new GamePlay("img/cowboy.png");
            Thread tGp = new Thread(g);
            tGp.start();

            setLayout(new BorderLayout());
            add(g);
            repaint();
            revalidate();
            //Voice Button 1
            se.setFile(".//Music//Button.wav");
            se.play();

        }
        if (me.getSource().equals(s2)) {
            GamePlay g = new GamePlay("img/soldier.png");
            Thread tGp = new Thread(g);
            tGp.start();
            
            setLayout(new BorderLayout());
            add(g);
            repaint();
            revalidate();
            //Voice Button 2
            se.setFile(".//Music//Button.wav");
            se.play();

        }
        if (me.getSource().equals(s3)) {
            GamePlay g = new GamePlay("img/alien2.png");
            Thread tGp = new Thread(g);
            tGp.start();
            
            setLayout(new BorderLayout());
            add(g);
            repaint();
            revalidate();
            
            //Voice Button 3
            se.setFile(".//Music//Button.wav");
            se.play();
        }
    }

    public void mouseReleased(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
    }

    public void mouseExited(MouseEvent me) {
    }

}
