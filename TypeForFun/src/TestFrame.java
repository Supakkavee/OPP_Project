import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestFrame extends JFrame implements ActionListener{

    JButton button1;
    JButton button2;

    JTextField textField;

    public TestFrame() {
        initComponents();
    }

    private void initComponents(){
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        textField = new JTextField();

        button1.setPreferredSize(new Dimension(100,20));
        button2.setPreferredSize(new Dimension(100,20));
        textField.setPreferredSize(new Dimension(300,20));
        textField.addActionListener(this);
        this.setSize(new Dimension(600, 300));
        this.setLayout(new BorderLayout());

        getContentPane().add(button1, BorderLayout.WEST);
        getContentPane().add(button2, BorderLayout.CENTER);
        getContentPane().add(textField, BorderLayout.EAST);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //This will set focus on the text field
        textField.requestFocusInWindow();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TestFrame();
            }
        });
    }
    public void actionPerformed(ActionEvent ae) {
        textField.setText("");

    }
}