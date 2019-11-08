package View;

import Contoller.GUIControl;
import View.MenuGame;
import Model.Helper;
import View.MyFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainGUI extends GUIControl implements ActionListener {

    private JPanel titleP;
    private JLabel titleL;
    private JButton startButton;
    private JPanel name = new MenuGame().getPanel();
    BgPanel bg = new BgPanel(new ImageIcon("img/bg2.jpg").getImage());

    public MainGUI() {

        setC(createC());
        //Label Helper class in Veiw
        titleL = Helper.createTitleLabel("Type For Fun");
        titleL.setBounds(340, 100, 600, 150);

        //Button Helper class in Veiw
        startButton = Helper.createButton("START");
        startButton.setBounds(540, 500, 200, 50);
        startButton.addActionListener(this);
        //add
        bg.add(titleL);
        bg.add(startButton);
        addC(bg);

    }

    public static void main(String[] args) {
        new MainGUI();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(startButton)) {
            bg.setVisible(false);
            getC().removeAll();
            getC().repaint();
            getC().revalidate();
            addC(name);
            getC().setBackground(Color.black);
        }

    }

}
