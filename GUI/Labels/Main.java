import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory ;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("D:/WiseMenu/Logo/mainLogo (1) (1).jpg") ;


        JLabel label = new JLabel() ; // Create A Label


        label.setText("Wise Menu"); // Set Text For The Label





        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // To Center Text (RIGHT , LEFT)
        label.setVerticalTextPosition(JLabel.TOP);

        label.setForeground(new Color(0xFFFF));
        label.setFont(new Font("MV Boli" , Font.PLAIN , 30));
        label.setIconTextGap(-10); // Padding Between Text And Image
        label.setBackground(Color.black); // Background Of The Label
        label.setOpaque(true); // To Show The Background Color For The Label


        Border border =  BorderFactory.createLineBorder(Color.CYAN , 3) ;
        label.setBorder(border); // We Made The Border


        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);


       // label.setBounds(10 , 10 , 25 , 50);

        JFrame frame =  new JFrame() ;
        frame.add(label) ; // To Add The Label
        frame.setIconImage(image.getImage());
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       // frame.setLayout(null);
       // frame.setSize(800 , 880);
        frame.pack(); // Will Give Us The Perfect Size
    }
}
