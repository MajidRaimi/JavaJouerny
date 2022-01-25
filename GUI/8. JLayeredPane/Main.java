import java.util.*;
import java.io.*;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // JLayeredPane = Swing Container That Provides A Third Dimension
        // For Positioning The Component , Depth , Z-Index

        JFrame frame = new JFrame();
        JLayeredPane layeredPane = new JLayeredPane();

        JLabel labelOne = new JLabel();
        JLabel labelTwo = new JLabel();
        JLabel labelThree = new JLabel();

        labelOne.setOpaque(true);
        labelOne.setBackground(Color.red);
        labelOne.setBounds(50, 50, 200, 200);

        labelTwo.setOpaque(true);
        labelTwo.setBackground(Color.blue);
        labelTwo.setBounds(100, 100, 200, 200);

        labelThree.setOpaque(true);
        labelThree.setBackground(Color.green);
        labelThree.setBounds(150, 150, 200, 200);


        // * Fact You Can Add Elements In Layers But You Will Face A Problem 
        // ! You Should Use Wrapper Class 
        layeredPane.add(labelOne, Integer.valueOf(2)) ; 
        layeredPane.add(labelTwo, Integer.valueOf(1)) ; 
        layeredPane.add(labelThree , Integer.valueOf(0)) ; 


        layeredPane.setBounds(0, 0, 500, 500);
        frame.add(layeredPane);

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }
}