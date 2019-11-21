package View;

import Model.Helper;
import Contoller.GUIControl;
import View.MyFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuGame implements MouseListener {

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

    }

    public JPanel getPanel() {
        return bg;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
        if (me.getSource().equals(s1)) {

        }
        if (me.getSource().equals(s2)) {

        }
        if (me.getSource().equals(s3)) {

        }
    }

    public void mouseReleased(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
    }

    public void mouseExited(MouseEvent me) {
    }

}
