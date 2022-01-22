import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {
    JButton button = new JButton() ;
    JLabel label = new JLabel() ;  
    MyFrame() {

        label.setText("I Was Clicked Once") ; 
        label.setBounds(0 , 100 , 150 , 100) ; 
        label.setVisible(false);

        button.setBounds(0,0,100,50) ; 
        button.setSize(100,50) ;
        button.addActionListener(this) ; // You Must Add This To Make The Button Listen 

        // Or You Can Do It The Short Way
        button.addActionListener(e -> sayHello()) ; 


        button.setText("Click Me") ; 

        button.setFocusable(false) ; // To Make The Button Look Clear

        button.setBackground(Color.lightGray) ; 

        this.setVisible(true);
        this.setLayout(null);
        this.setSize(750, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button);
        this.add(label) ; 
    }   


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("I Was Clicked !");
            button.setEnabled(false); // The Button Can Only CBe Clicked Once
            label.setVisible(true) ; 
        }
    }


    public void sayHello(){
        System.out.println("Hello");
    }


}
