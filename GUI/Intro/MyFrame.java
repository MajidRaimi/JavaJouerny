import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyFrame(){
         // JFrame = a GUI Window To Add Components
     JFrame frame = new JFrame() ;   

     this.setSize(420 , 420); // For Size (X , Y)

     this.setTitle("JFrame Title");

     this.setResizable(false); // Prevent Frame From Being Resized

     ImageIcon img = new ImageIcon("D:/WiseMenu/Logo/mainLogo.png") ; // Will Create Image Icon

     this.setIconImage(img.getImage()); // Will Set The Icon

     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     this.setVisible(true); // To Make It Visible

     this.getContentPane().setBackground(new Color(0xFF40A798)); // Change Color Of The Background (Works Like Flutter)
     
    }


}
