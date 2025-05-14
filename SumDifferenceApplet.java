import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SumDifferenceApplet extends Applet implements ActionListener {
    TextField num1Field, num2Field, sumField, diffField;
    Button calculateButton;

    public void init() {
        Label num1Label = new Label("Enter Number 1:");
        Label num2Label = new Label("Enter Number 2:");
        Label sumLabel = new Label("Sum:");
        Label diffLabel = new Label("Difference:");

        num1Field = new TextField(10);
        num2Field = new TextField(10);
        sumField = new TextField(10);
        diffField = new TextField(10);

        sumField.setEditable(false);
        diffField.setEditable(false);

        calculateButton = new Button("Calculate");
        calculateButton.addActionListener(this);

        setLayout(new GridLayout(5, 2));

        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(sumLabel);
        add(sumField);
        add(diffLabel);
        add(diffField);
        add(calculateButton);
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
}