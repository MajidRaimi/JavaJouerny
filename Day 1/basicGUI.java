import javax.swing.JOptionPane;
public class basicGUI {
	public static void main(String args[]) {
		// Take Input 
		String name = JOptionPane.showInputDialog("Please Enter Your Name : ") ; 
		// Show Message
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		// Change String To Int 
		int age =  Integer.parseInt(JOptionPane.showInputDialog("Please Enter Your Age : ")) ; 
		
		JOptionPane.showMessageDialog(null, "You Are " + age + " Years Old");
		
		double height =  Double.parseDouble(JOptionPane.showInputDialog("Please Enter Your Height : ")) ; 
		JOptionPane.showMessageDialog(null, "You Are " + height + " Cm")	; 
		
		
		
	}
}
