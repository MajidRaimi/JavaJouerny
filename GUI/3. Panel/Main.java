import java.util.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;

public class Main {

    public static void main(String[] args) {

        // JPanel = GUI Component That Functions As A Container To Hold Other Components

        JLabel label = new JLabel();
        label.setText("Hi I Am Label");
        label.setForeground(Color.WHITE);

        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);

        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);

        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);

        // Panels Work With Flow Layout Manager --> Vertical = Top , Horizontal = Center
        // ! The Problem With Flow Layout Manager Is You Can't Set Vertical And
        // ! Horizontal Axis Like Frames , Can You Fix That ?

        // ? To Fix This You Should Change The Layout Manager To Border Layout Manager
        greenPanel.setLayout(new BorderLayout());
        greenPanel.add(label); // You Should Add The Label To The Panel After Changing The Layout Manager
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        // Now You Can Change Both Vertical And Horizontal Axis For The Label

        JFrame frame = new JFrame(); // Create Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}