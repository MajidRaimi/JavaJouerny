import java.util.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        // JFrame = a GUI Window

        this.setTitle("Java GUI Class One"); // Change The Title Of The Frame

        // ! When You Close The Program It Does Not Exit , But How To Fix It ? ( On Default it's "HIDE_ON_CLOSE" )
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ? The Answer
        // * Fact : You Can Make It To "DO_NOTHING_ON_CLOSE" And None One Can Exit The Program

        this.setSize(800, 600); // Set Both Height And Width
        // ! Users Can Resize The Window Size , But How To Fix It ?
        this.setResizable(false); // ? The Answer

        this.setVisible(true); // Make It Visible

        // ! In Swing Library The Main Icon Is Java Icon , But How We Can Fix It ?
        ImageIcon image = new ImageIcon("MainIcon.png"); // * Create ImageIcon
        this.setIconImage(image.getImage()); // ? The Answer Change The Image

        Color mainColor = new Color(0xFF4527A0); // "0xFF" Then Put Your Hex Value
        this.getContentPane().setBackground(mainColor); // Change Color

    }

}
