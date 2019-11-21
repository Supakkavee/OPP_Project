
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test {

    Timer t = new Timer();

    private void init() {

        JFrame fr = new JFrame();
        Thread tr = new Thread(t);
        tr.start();
        fr.setSize(400, 400);
        fr.setVisible(true);
        fr.add(t);
    }

    public static void main(String[] args) {
        new Test().init();
    }
}
