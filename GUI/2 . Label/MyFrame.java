import java.util.* ; 
import java.awt.* ; 
import java.io.* ; 
import javax.swing.* ;  
public class MyFrame extends JFrame {
    
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setSize(800,800) ; 
        this.setVisible(true);
        this.setResizable(true);
        // this.setLayout(null) ; // Making The Layout Manager To Null 
        this.pack(); // Will Resize To The Label Size || Make Sure To Add The Label Before The Pack
    }

}
