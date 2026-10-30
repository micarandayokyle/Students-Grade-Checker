import javax.swing.*;
import java.awt.*;

public class CalculatorFrame{
    public static void main(String[] args){
        JFrame frame = new JFrame("CalculatorGUI");
        frame.setSize(400, 350);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);        
    }
}