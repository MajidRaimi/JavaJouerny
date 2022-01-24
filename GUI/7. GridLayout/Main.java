import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /*
         * GridLayout = Places Components In A Grid Of Cells
         * Each Component Takes All The Available Space Withing Its Cell ,
         * And Each Cell It The Same Size
         */

        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(3, 3, 25, 25)); // You Can Change The Rows And Columns + Margin From Here
                                                     // "GridLayout(Rows , Columns , Width , Height)"
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        // ! What Happens When We Add Another Element ? 
        // ? It Will Create A New Column + Will Make It Balance As Much As Possible 

        frame.add(new JButton("10")) ; 

        frame.setVisible(true);
    }
}