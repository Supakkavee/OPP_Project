
package function;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        GamePlay g = new GamePlay("img/soldier.png");
        Thread tGp = new Thread(g);
        tGp.start();
        fr.add(g);
        fr.setSize(1280, 720);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fr.setLayout(null);
        fr.setVisible(true);
        fr.setResizable(false);
    }
}