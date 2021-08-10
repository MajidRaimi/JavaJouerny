import java.util.Scanner ; 


public class mathClass {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in) ; 
		
		System.out.print("Please Enter The Sin : ");
		double x = scanner.nextDouble() ; 
			
		System.out.print("Please Enter The Cos : ");
		scanner.nextLine() ; 
		double y = scanner.nextDouble() ; 
		
		double z = Math.sqrt(Math.pow(x, 2) + Math.pow(y , 2)) ;   
		
		System.out.println("The Answer Is : " + z);
		
		
		
	}
}
