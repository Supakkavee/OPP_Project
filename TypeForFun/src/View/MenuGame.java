package View;

import Model.Helper;
import Contoller.GUIControl;
import View.MyFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuGame implements ActionListener{
    private JPanel mainMenuP;
    private JButton EasyB, NormalB, HardB, ExitB;
    private BgPanel bg = new BgPanel(new ImageIcon("img/bg1.jpg").getImage());
    public MenuGame(){
        BgPanel img = new BgPanel(new ImageIcon("img/Jeanne1.png").getImage());
        img.setBounds(0, 100, 600, 500);
        bg.add(img);
        
        mainMenuP = new JPanel();
        mainMenuP.setBounds(440, 100, 400, 150);
        mainMenuP.setLayout(new GridLayout(3,1));
        
        EasyB = Helper.createButton("Easy");
        EasyB.addActionListener(this);
        mainMenuP.add(EasyB);
        
        NormalB = Helper.createButton("Normal");
        NormalB.addActionListener(this);
        mainMenuP.add(NormalB);
        
        HardB = Helper.createButton("Hard");
        HardB.addActionListener(this);
        mainMenuP.add(HardB);
        
        ExitB = Helper.createButton("Exit");
        ExitB.setBounds(440, 500, 400, 50);
        ExitB.addActionListener(this);
        bg.add(ExitB);
        
        BgPanel img1 = new BgPanel(new ImageIcon("img/Europa.png").getImage());
        img1.setBounds(750, 100, 600, 500);
        bg.add(img1);
        
        bg.add(mainMenuP);
    }

    public JPanel getPanel(){
        return bg; 
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(ExitB)) {
            System.exit(0);
        }
        if (ae.getSource().equals(EasyB)) {

        }
        if (ae.getSource().equals(NormalB)) {

        }
        if (ae.getSource().equals(HardB)) {

        }
    }
}
