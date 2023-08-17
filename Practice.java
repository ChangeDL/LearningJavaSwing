import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Swing Practice");
        frame.setSize(400, 300);

        JPanel greetingPanel = new JPanel();
        greetingPanel.setLayout(new BoxLayout(greetingPanel, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Hello, Swing!");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        greetingPanel.add(label);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        JButton button = new JButton("Click Me If You Dare");
        JLabel labelClick = new JLabel("");
        topPanel.add(button);
        topPanel.add(labelClick);

        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new FlowLayout());
        JLabel textFieldHeader = new JLabel("Write Something for me.");
        JTextField textField = new JTextField(15);
        JButton submitTextButton = new JButton("Submit Text");
        middlePanel.add(textFieldHeader);
        middlePanel.add(textField);
        middlePanel.add(submitTextButton);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        JLabel textFieldResult = new JLabel("");
        bottomPanel.add(textFieldResult);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(greetingPanel);
        mainPanel.add(topPanel);
        mainPanel.add(middlePanel);
        mainPanel.add(bottomPanel);

        frame.add(mainPanel);

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
