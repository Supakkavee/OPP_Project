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

    public MenuGame() {

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

    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
        removeAll();
        repaint();
        revalidate();
        if (me.getSource().equals(s1)) {
            GamePlay g = new GamePlay("img/cowboy.png");
            Thread tGp = new Thread(g);
            tGp.start();
            add(g);

        }
        if (me.getSource().equals(s2)) {
            GamePlay g = new GamePlay("img/soldier.png");
            Thread tGp = new Thread(g);
            tGp.start();
            add(g);

        }
        if (me.getSource().equals(s3)) {
            GamePlay g = new GamePlay("img/alien2.png");
            Thread tGp = new Thread(g);
            tGp.start();
            add(g);

        }
    }

    public void mouseReleased(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
    }

    public void mouseExited(MouseEvent me) {
    }
    /*public static void main(String[] args) {
        JFrame fr = new JFrame();
        MenuGame m = new MenuGame();
        fr.add(m);
        fr.setSize(1280, 720);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fr.setLayout(null);
        fr.setVisible(true);
        fr.setResizable(false);

    }*/


}
