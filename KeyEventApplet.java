import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class KeyEventApplet extends Applet implements KeyListener {
    String message = "";

    public void init() {
        addKeyListener(this);
        setFocusable(true);
    }

    public void keyPressed(KeyEvent e) {
        message = "Key Down: " + e.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        message = "Key Up: " + e.getKeyChar();
        repaint();
    }

    public void keyTyped(KeyEvent e) {
        message = "Key Typed: " + e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 20, 50);
    }
}