package LamdaExpression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click Me");
        frame.add(button);
        //  Add Action listener using Anonymous class
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button Clicked");
//                JOptionPane.showMessageDialog(null, "Button Clicked");
//            }
//        });

        //  Add Action listener using Lambda Expression
        button.addActionListener((ActionEvent e) -> {
            System.out.println("Button Clicked");
            JOptionPane.showMessageDialog(null, "Button Clicked");
        });

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
