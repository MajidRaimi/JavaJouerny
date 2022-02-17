import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;
import javax.swing.border.Border; 
public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton("Submit") ;
    JTextField textField = new JTextField() ; 
    MyFrame(){


       
        textField.setPreferredSize(new Dimension(250 , 40)) ; 
        textField.setFont(new Font("Arial", Font.PLAIN , 25)) ;
        textField.setText("Username") ;
        





       
        button.addActionListener(this) ; 



        this.add(button);
        this.add(textField) ; 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new FlowLayout()); ;         
        this.pack();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println(
                textField.getText() 
            );
            textField.setEditable(false);
            button.setEnabled(false) ; 
        }

    }
    
}
