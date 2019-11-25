package View;

import Model.Helper;
import function.GamePlay;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class win extends JPanel implements MouseListener {
    private BgPanel bg = new BgPanel(new ImageIcon("img/win2.gif").getImage());
    private BgPanel s1 = new BgPanel(new ImageIcon("img/retry.png").getImage());
    private BgPanel s2 = new BgPanel(new ImageIcon("img/exitover.png").getImage());

    public win() {
        setLayout(null);
        s1.setBounds(700, 300, 168, 80);
        s1.addMouseListener(this);

        s2.setBounds(950, 300, 168, 80);
        s2.addMouseListener(this);


        bg.add(s1);
        bg.add(s2);
        add(bg);

    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
        SoundEffect se1 = new SoundEffect();
        se1.setFile(".//Music//Button.wav");
        se1.play();
        
        removeAll();
        repaint();
        revalidate();
        
        if (me.getSource().equals(s1)) {
            setLayout(new BorderLayout());
            MenuGame g = new MenuGame();
            add(g);

        }
        if (me.getSource().equals(s2)) {
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
