package View;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class BgPanel extends JPanel {

    private Image img;

    public BgPanel(String img) {
        this(new ImageIcon(img).getImage());
    }
    public BgPanel(Image img, int w, int h){
        this.img = img;
        Dimension size = new Dimension(w, h);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }
    public BgPanel(Image img) {
        this.img = img;
        Dimension size = new Dimension(1280, 720);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }

}