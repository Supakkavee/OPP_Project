package View;

import java.awt.*;
import javax.swing.*;
public class MyFrame extends JFrame{
    public MyFrame(){
        setTitle("Type For Fun");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }
}
