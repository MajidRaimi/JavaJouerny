import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel ; 
import java.awt.Font;


public class Main {
    
    public static void main(String[] args) {
        

        // Flow Layout ==> Vertical = Top // Horizantal = Center
        // Border Layout ==> Vertical Center // Horizantal = Left 

        // Frame = Border Layout 
        // Panel = Flow Layout 


        JLabel label = new JLabel() ; 
        label.setText("Hello , World!");
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        ImageIcon icon = new ImageIcon("thumbsUp.png") ; 
        label.setIcon(icon);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setFont(new Font("MV Boli" , Font.PLAIN , 30));
        label.setBounds(0 , 0 , 300 , 300);







        JPanel redPanel  = new JPanel() ; 
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0 , 0 , 250 , 250);
        //redPanel.add(label) ; 



        JPanel bluePanel = new JPanel() ; 
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250 , 0 , 250 , 250);


        JPanel greenPanel = new JPanel() ; 
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0 , 250 , 500 , 250);
        // greenPanel.setLayout(new BorderLayout()); // Works Like Frame
        greenPanel.setLayout(null);

        greenPanel.add(label) ;

        JFrame frame = new JFrame() ; 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750  , 750);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(redPanel) ; 
        frame.add(bluePanel) ;
        frame.add(greenPanel) ; 

       /// frame.pack();

    }



}
