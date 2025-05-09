import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {
    JTextField nameField, ageField;
    JRadioButton male, female;
    JComboBox<String> departmentBox;
    JCheckBox javaCheck, pythonCheck, cppCheck;
    JButton submitButton, resetButton;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Age:"));
        ageField = new JTextField();
        add(ageField);

        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        add(new JLabel("Department:"));
        String[] departments = { "Computer Science", "Electronics", "Mechanical", "Civil" };
        departmentBox = new JComboBox<>(departments);
        add(departmentBox);

        add(new JLabel("Courses:"));
        JPanel coursePanel = new JPanel();
        javaCheck = new JCheckBox("Java");
        pythonCheck = new JCheckBox("Python");
        cppCheck = new JCheckBox("C++");
        coursePanel.add(javaCheck);
        coursePanel.add(pythonCheck);
        coursePanel.add(cppCheck);
        add(coursePanel);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> {
            nameField.setText("");
            ageField.setText("");
            genderGroup.clearSelection();
            departmentBox.setSelectedIndex(0);
            javaCheck.setSelected(false);
            pythonCheck.setSelected(false);
            cppCheck.setSelected(false);
        });
        add(resetButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String age = ageField.getText();
        String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Not Selected";
        String department = (String) departmentBox.getSelectedItem();
        String courses = "";
        if (javaCheck.isSelected()) courses += "Java ";
        if (pythonCheck.isSelected()) courses += "Python ";
        if (cppCheck.isSelected()) courses += "C++ ";

        JOptionPane.showMessageDialog(this,
            "Name: " + name + "\nAge: " + age + "\nGender: " + gender +
            "\nDepartment: " + department + "\nCourses: " + courses,
            "Registration Details", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
