import java.util.Scanner;

public class userInput {
	
	public static void main(String[] args) {
	
		Scanner scanner  = new Scanner(System.in); 
		
		System.out.print("Please Enter Your Name : ");
		String name = scanner.nextLine() ; 
		 
		
		System.out.print("Please Enter Your Age : ");
		int age = scanner.nextInt() ; 
		
		System.out.print("What's Your Favroite Food : ");
		scanner.nextLine() ;
		String favFood = scanner.nextLine() ; 
		
		
		
		
		System.out.print("Hello " + name + " You Are " + age + " Years Old , And Your Favorite Food Is " + favFood);
		
		
		scanner.close();
		
	}
	
	
	
}
