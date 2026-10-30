import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Result Checker");
        JButton button = new JButton("Show Result");

        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                frame,
                "Your result is displayed!",
                "Result",
                JOptionPane.INFORMATION_MESSAGE
            );
        });

        frame.setLayout(new FlowLayout());
        frame.add(button);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
