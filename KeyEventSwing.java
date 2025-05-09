import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventSwing extends JFrame implements KeyListener {
    private JLabel messageLabel;

    public KeyEventSwing() {
        setTitle("Key Event Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        messageLabel = new JLabel("Press any key...");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        add(messageLabel);

        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        messageLabel.setText("Key Down: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        messageLabel.setText("Key Up: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        messageLabel.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(KeyEventSwing::new);
    }
}
