package Contoller;

import View.MyFrame;
import View.MenuGame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIControl {

    private Container c;
    MyFrame fr = new MyFrame();

    public Container getC() {
        return c;
    }

    public void setC(Container c) {
        this.c = c;
    }
    public void addC(Container c) {
        this.c.add(c);
    }
    public Container createC(){
        return this.c = fr.getContentPane();
    }
}
