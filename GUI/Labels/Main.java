import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame() ;  


        JLabel label = new JLabel() ; // Create A Label


        label.setText("Wise Menu"); // Set Text For The Label

        frame.add(label) ; // To Add The Label

       

        ImageIcon image = new ImageIcon("D:/WiseMenu/Logo/mainLogo.png") ; 

        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // To Center Text (RIGHT , LEFT)
        //label.setVerticalTextPosition(JLabel.TOP);

        label.setForeground(new Color(0xFFFFFFFF));
        label.setFont(new Font("MV Boli" , Font.PLAIN , 50));


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1000 , 1000);
    }
}
