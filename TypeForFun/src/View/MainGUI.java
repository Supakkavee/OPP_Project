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
    private JPanel name = new MenuGame();//.getPanel();
    BgPanel bg = new BgPanel(new ImageIcon("img/background.png").getImage());
    BgPanel start = new BgPanel(new ImageIcon("img/start.png").getImage());
    BgPanel exit = new BgPanel(new ImageIcon("img/exit.png").getImage());

    public MainGUI() {

        fr = new JFrame();
        start.setBounds(540, 425, 210, 100);
        start.addMouseListener(this);
        bg.add(start);

        exit.setBounds(540, 560, 210, 100);
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

    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
        SoundEffect se = new SoundEffect();
        se.setFile(".//Music//Button.wav");
        se.play();
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
        }
        if (me.getSource().equals(start)) {
            bg.setVisible(false);
            fr.getContentPane().removeAll();
            fr.getContentPane().repaint();
            fr.getContentPane().revalidate();
            fr.add(name);

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
