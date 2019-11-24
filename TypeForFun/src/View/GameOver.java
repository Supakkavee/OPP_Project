package View;

import Model.Helper;
import function.GamePlay;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameOver extends JPanel implements MouseListener {

    private BgPanel bg = new BgPanel(new ImageIcon("img/gameover.png").getImage());
    private BgPanel s1 = new BgPanel(new ImageIcon("img/retry.png").getImage());
    private BgPanel s2 = new BgPanel(new ImageIcon("img/exitover.png").getImage());
    private String character;

    public GameOver(String img) {

        setLayout(null);
        s1.setBounds(700, 300, 168, 80);
        s1.addMouseListener(this);

        s2.setBounds(950, 300, 168, 80);
        s2.addMouseListener(this);

        bg.add(s1);
        bg.add(s2);
        add(bg);
        this.character = img;

    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
        SoundEffect se1 = new SoundEffect();

        removeAll();
        repaint();
        revalidate();
        if (me.getSource().equals(s1)) {
            se1.setFile(".//Music//Button.wav");
            se1.play();
            GamePlay g = new GamePlay(this.character);
            Thread tGp = new Thread(g);
            tGp.start();
            setLayout(new BorderLayout());
            add(g);
        }
        if (me.getSource().equals(s2)) {
            se1.setFile(".//Music//Button.wav");
            se1.play();
            System.exit(0);
        }

    }

    public void mouseReleased(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
    }

    public void mouseExited(MouseEvent me) {
    }

}
