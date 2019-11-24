package function;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Shoot extends JLabel implements ActionListener {

    Timer t = new Timer(1, this);
    private int x = 0, velX = 2;
    Image bullet = new ImageIcon("img/bullet.png").getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT);

    public void paint(Graphics g) {
        g.drawImage(bullet, x, 0, null);

        t.start();
         repaint();
    }


    public void actionPerformed(ActionEvent ae) {
        if(x < 0 || x > 500){
            setVisible(false);
        }
        x += velX;
        repaint();
    }

    public void setX() {
        this.x = 0;
    }
}
