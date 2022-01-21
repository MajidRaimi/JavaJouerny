import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

import java.io.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // JLabel = A GUI Component To Display Area Of String , Images Or Both Of Them .

        MyFrame myFrame = new MyFrame();
        ImageIcon image = new ImageIcon("codingImage.png");

        Color textColor = new Color(0xFF4527A0); // Create Color
        Border border = BorderFactory.createLineBorder(textColor , 3) ; 

        JLabel label = new JLabel(); // Create A Label
        label.setText("Bro, Do You Even CCSIT?"); // Set Text For The Label
        label.setIcon(image);
        // ! In Java Swing The Text Will Be Next To The ImageIcon , But Can We Fix This ?
        label.setHorizontalTextPosition(JLabel.CENTER); // ? JLabel.(CENTER , RIGHT , LEFT ) .. By Default Its Right
        label.setVerticalTextPosition(JLabel.TOP); // ? JLabel.(CENTER , TOP , BOTTOM) .. By Default Its Center

        // ! By Default The Label Text Color Is Black , Can We Fix The ?

        label.setForeground(textColor); // Change The Color 

        // ! Can You Change The Font ? 
        Font textFont = new Font("MV Boli", Font.PLAIN, 20) ; // Create Font , Style And Size
        label.setFont(textFont); // Change The Font; 

        // ! Can You Change The Gap Between The Image And The Text ? 
        label.setIconTextGap(50); // Margining By Pixels 
        // * Fact : You Can Put Negative Values To Make Things Closer

        // ! Can You Change The Background Color ? 

        label.setBackground(Color.black); // Will Set The Background color , but it will not work 
        label.setOpaque(true); // Till You Make The Opaque True
        // * Fact : Labels Like To Take Add Much Possible Of Space 


        // ! Can You Add Border ? 
        label.setBorder(border); 


        // You Can Change The Alignment For Both Vertical And Horizontal Of Label
        
        label.setVerticalAlignment(JLabel.CENTER); // Center By Default
        label.setHorizontalAlignment(JLabel.CENTER); // Left By Default
        
        // After Make The Layout Manager To Null 
        // You Can Set The Label To Specific Place And Size 

        // label.setBounds(0, 0, 500, 500); // Change x , y Position And Size  

        myFrame.add(label); // Add The Label To The Frame

    }
}