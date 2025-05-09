import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SumDifferenceSwing extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, sumField, diffField;
    private JButton calculateButton;

    public SumDifferenceSwing() {
        setTitle("Sum and Difference Calculator");
        setLayout(new GridLayout(5, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);

        add(new JLabel("Enter Number 1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Enter Number 2:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Sum:"));
        sumField = new JTextField();
        sumField.setEditable(false);
        add(sumField);

        add(new JLabel("Difference:"));
        diffField = new JTextField();
        diffField.setEditable(false);
        add(diffField);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        add(new JLabel());

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            int sum = num1 + num2;
            int diff = num1 - num2;

            sumField.setText(String.valueOf(sum));
            diffField.setText(String.valueOf(diff));
        } catch (NumberFormatException ex) {
            sumField.setText("Invalid Input");
            diffField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SumDifferenceSwing::new);
    }
}
