import java.util.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Layout Manager = Defines The Natural Layout For Components Within A Container

        // 3 Common Managers

        // Border Layout = A Border Layout Places A Component Within Five Areas :
        // NORTH , EAST , WEST , SOUTH , CENTER
        // All Extra Spaces Are Places In The Center

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(20, 20)); // Change Layout Manger + Adding Margin For The Width And Height
        frame.setSize(new Dimension(500, 500));

        // Making new Panels
        JPanel panelOne = new JPanel();
        JPanel panelTwo = new JPanel();
        JPanel panelThree = new JPanel();
        JPanel panelFour = new JPanel();
        JPanel panelFive = new JPanel();

        // Setting Colors For The Panel
        panelOne.setBackground(Color.red);
        panelTwo.setBackground(Color.blue);
        panelThree.setBackground(Color.green);
        panelFour.setBackground(Color.yellow);
        panelFive.setBackground(Color.cyan);

        // Giving Preferred Size
        panelOne.setPreferredSize(new Dimension(100, 100));
        panelTwo.setPreferredSize(new Dimension(100, 100));
        panelThree.setPreferredSize(new Dimension(100, 100));
        panelFour.setPreferredSize(new Dimension(100, 100));
        panelFive.setPreferredSize(new Dimension(100, 100));

        // ----------- Sub Panels -----------

        JPanel panelSix = new JPanel();
        JPanel panelSeven = new JPanel();
        JPanel panelEight = new JPanel();
        JPanel panelNine = new JPanel();
        JPanel panelTen = new JPanel();

        // Setting Colors For The Panel
        panelSix.setBackground(Color.black);
        panelSeven.setBackground(Color.darkGray);
        panelEight.setBackground(Color.gray);
        panelNine.setBackground(Color.orange);
        panelTen.setBackground(Color.magenta);

        // Giving Preferred Size
        panelSix.setPreferredSize(new Dimension(50, 50));
        panelSeven.setPreferredSize(new Dimension(50, 50));
        panelEight.setPreferredSize(new Dimension(50, 50));
        panelNine.setPreferredSize(new Dimension(50, 50));
        panelTen.setPreferredSize(new Dimension(50, 50));

        // Changing The Layout Manager For PanelFive To Border Layout
        panelFive.setLayout(new BorderLayout(25, 25));

        // Locating The Sub Panels And Adding Them To PanelFive
        panelFive.add(panelSix, BorderLayout.NORTH);
        panelFive.add(panelSeven, BorderLayout.EAST);
        panelFive.add(panelEight, BorderLayout.WEST);
        panelFive.add(panelNine, BorderLayout.SOUTH);
        panelFive.add(panelTen, BorderLayout.CENTER);

        // Locating The Panel To The Frame And Adding Them
        frame.add(panelOne, BorderLayout.NORTH);
        frame.add(panelTwo, BorderLayout.EAST);
        frame.add(panelThree, BorderLayout.WEST);
        frame.add(panelFour, BorderLayout.SOUTH);
        frame.add(panelFive, BorderLayout.CENTER);

    }
}