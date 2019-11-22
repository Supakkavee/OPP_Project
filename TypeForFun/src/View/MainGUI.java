package View;

import Contoller.GUIControl;
import View.MenuGame;
import Model.Helper;
import View.MyFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MainGUI extends GUIControl implements MouseListener {

    private JPanel name = new MenuGame().getPanel();
    BgPanel bg = new BgPanel(new ImageIcon("img/background.png").getImage());
    BgPanel start = new BgPanel(new ImageIcon("img/start.png").getImage());
    BgPanel exit = new BgPanel(new ImageIcon("img/exit.png").getImage());

    public MainGUI() {

        setC(createC());

        start.setBounds(540, 425, 210, 100);
        start.addMouseListener(this);
        bg.add(start);

        exit.setBounds(540, 560, 210, 100);
        exit.addMouseListener(this);
        bg.add(exit);
        addC(bg);
        getC().repaint();
        getC().revalidate();
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
        if (me.getSource().equals(start)) {
            bg.setVisible(false);
            getC().removeAll();
            getC().repaint();
            getC().revalidate();
            addC(name);
            getC().setBackground(Color.black);
        } else {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
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
