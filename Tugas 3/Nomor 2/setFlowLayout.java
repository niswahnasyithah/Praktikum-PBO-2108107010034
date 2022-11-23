import java.awt.*;
import javax.swing.*;

/**
 * setFlowLayout
 */
public class setFlowLayout {
    public setFlowLayout() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);

        frame.setLayout(new FlowLayout());
        frame.add(new JButton("One"));
        frame.add(new JButton("Two"));
        frame.add(new JButton("Three"));
        frame.add(new JButton("Four"));
        frame.add(new JButton("Five"));

        frame.setVisible(true);
    }
}