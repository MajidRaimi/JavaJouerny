import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /*
         * FlowLayout = Places Components In A Row , Sized At Their Preferred Size .
         * If The Horizontal Space In The Container Is Too Small , The Flow Layout
         * Class Will User The Next Row
         */

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // In Default Frames Use BorderLayout , We Will
                                                                     // Change It
        // ! In Default The FlowLayout Gives Center Layout "FlowLayout.CENTER" , You Can
        // ! You Change It ?

        // If You Want To Start From The Right "FlowLayout.LEADING"
        // If You Want To Start From The Left "FlowLayout.TRAILING"
        // Making Buttons And Adding Them To The Frame

        // You Can Also Set Margin Between The Elements "frame.setLayout(new
        // FlowLayout(FlowLayout.LEADING , WIDTH , HEIGHT));"

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 250));
        panel.setBackground(Color.gray) ; 
        panel.setLayout(new FlowLayout(FlowLayout.LEADING)) ; 

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));


        
        frame.add(panel) ; 
        frame.setVisible(true); // Preferred To Be At The Very End
    }
}