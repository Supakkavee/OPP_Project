/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import javax.swing.JFrame;

/**
 *
 * @author LAB205_30
 */
public class MyFrame {
//    public static void main(String[] args) {
//        JFrame f = new JFrame();
//        MyClock time = new MyClock();
//        Thread t1 = new Thread(time);
//        t1.start();
//        f.add(time);
//        f.setTitle("Calendar");
//        f.setSize(1800, 500);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
//    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        MyClock time = new MyClock();
        Thread t1 = new Thread(time);
        t1.start();
        f.add(time);
        f.setTitle("Calendar");
        f.setSize(1800, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
