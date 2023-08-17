import javax.swing.*;

public class Practice {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Swing Practice");
        frame.setSize(400, 300);
        JLabel label = new JLabel("Hello, Swing!");
        JButton button = new JButton("Click Me If You Dare");

        frame.add(label);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
