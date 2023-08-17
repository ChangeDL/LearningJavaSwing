import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Swing Practice");
        frame.setSize(400, 300);
        JLabel label = new JLabel("Hello, Swing!");
        JLabel labelClick = new JLabel("");
        JButton button = new JButton("Click Me If You Dare");
        JButton submitTextButton = new JButton("Submit Text");
        JTextField textField = new JTextField(15);
        JLabel textFieldHeader = new JLabel("Write Something for me.");
        JLabel textFieldResult = new JLabel("");

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button);
        frame.add(labelClick);
        frame.add(textFieldHeader);
        frame.add(textField);
        frame.add(submitTextButton);
        frame.add(textFieldResult);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String labelText = labelClick.getText();
                int textLength = labelText.length();
                if (textLength == 0) {
                    labelClick.setText("WHY DID YOU CLICK ME! CLICK IT AGAIN AND HIDE ME!");
                } else {
                    labelClick.setText("");
                }
            }
        });

        submitTextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                textFieldResult.setText("You entered: " + inputText);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
