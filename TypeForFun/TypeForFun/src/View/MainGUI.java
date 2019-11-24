package View;

import View.MenuGame;
import Model.Helper;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MainGUI implements MouseListener {

    private JFrame fr;
    private JPanel name = new MenuGame();
    private BgPanel bg = new BgPanel(new ImageIcon("img/background.png").getImage());
    private BgPanel start = new BgPanel(new ImageIcon("img/start.png").getImage());
    private BgPanel exit = new BgPanel(new ImageIcon("img/exit.png").getImage());
    private static SoundEffect se = new SoundEffect();

    public MainGUI() {

        fr = new JFrame();
        start.setBounds(540, 390, 210, 100);
        start.addMouseListener(this);
        bg.add(start);

        exit.setBounds(540, 530, 210, 100);
        exit.addMouseListener(this);
        bg.add(exit);
        fr.add(bg);
        fr.getContentPane().repaint();
        fr.getContentPane().revalidate();
        fr.setTitle("Type Slayer");
        fr.setSize(1280, 720);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.getContentPane().setBackground(Color.black);
        fr.setVisible(true);
        fr.setResizable(false);
    }

    public static void main(String[] args) {
        new MainGUI();
        se.setFile(".//Music//intro.wav");
        se.play();
        se.loop(100);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
        //Click Button song stop
        se.stop();
        //Click Button voice
        SoundEffect se1 = new SoundEffect();
        se1.setFile(".//Music//Button.wav");
        se1.play();
        try {
            Thread.sleep(250);
            se1.stop();
        } catch (InterruptedException ex) {
        }
        if (me.getSource().equals(start)) {
           
            
            fr.setContentPane(name);
            fr.getContentPane().setPreferredSize(new Dimension(1280, 720));
            fr.repaint();
            fr.revalidate();
            fr.pack();

        } else {
            System.exit(0);
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

}
