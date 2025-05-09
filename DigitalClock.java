import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JFrame {
    private JLabel timeLabel;
    private SimpleDateFormat timeFormat;

    public DigitalClock() {
        setTitle("Digital Clock");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        timeLabel.setForeground(Color.BLUE);
        add(timeLabel, BorderLayout.CENTER);

        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();

        updateTime();
        setVisible(true);
    }

    private void updateTime() {
        String time = timeFormat.format(new Date());
        timeLabel.setText(time);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DigitalClock::new);
    }
}
