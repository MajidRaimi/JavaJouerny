import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    LaunchPage() {
        
        myButton.setBounds(100,160,200,40) ; 
        myButton.setFocusable(false);
        myButton.addActionListener(this);





        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == myButton) {
            NewWindow newWindow = new NewWindow() ; 
            frame.setVisible(false);
            frame.dispose();
        }


    }

}
