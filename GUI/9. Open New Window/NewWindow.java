import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel() ;
    NewWindow() {

        label.setText("New Window");
        
        label.setBounds(120,160,200,40) ; 




        frame.add(label , BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
