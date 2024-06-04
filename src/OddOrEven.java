import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OddOrEven {

    OddOrEven() {
        JFrame frame = new JFrame();

        // Label
        JLabel label = new JLabel("Odd or Even");
        label.setBounds(30, 5, 80, 25);
        frame.add(label);

        // Text Field
        JTextField textField = new JTextField();
        textField.setBounds(30, 30, 100, 20);
        frame.add(textField);

        // Button
        JButton button = new JButton("Submit");
        button.setBounds(30, 52, 80, 20);
        button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(textField.getText());
                    if (number % 2 == 0) {
                        JOptionPane.showMessageDialog(frame, "is even");
                    } else {
                        JOptionPane.showMessageDialog(frame, "is odd");
                    }
                } catch (NumberFormatException ex) {
                    textField.setText(null);
                    JOptionPane.showMessageDialog(frame, "Invalid number");
                }
            }
        });
        frame.add(button);

        // Frame Settings
        frame.setTitle("Odd Or Even");
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new OddOrEven();
    }
}
