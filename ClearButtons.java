import java.awt.*;
import javax.swing.*;

public class ClearButtons {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Clear Buttons GUI");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        JLabel lblName = new JLabel("Name:");
        JTextField txtName = new JTextField(30);

        JLabel lblAge = new JLabel("Age:");
        JTextField txtAge = new JTextField(30);

        JLabel lblCourse = new JLabel("Course:");
        JTextField txtCourse = new JTextField(30);

        JLabel lblYear = new JLabel("Year Level:");
        JTextField txtYear = new JTextField(30);

        JButton btnClear = new JButton("CLEAR");

        frame.add(lblName);
        frame.add(txtName);

        frame.add(lblAge);
        frame.add(txtAge);

        frame.add(lblCourse);
        frame.add(txtCourse);

        frame.add(lblYear);
        frame.add(txtYear);

        frame.add(btnClear);

        btnClear.addActionListener(e -> {
            txtName.setText("");
            txtAge.setText("");
            txtCourse.setText("");
            txtYear.setText("");
        });

        frame.setVisible(true);
    }
}