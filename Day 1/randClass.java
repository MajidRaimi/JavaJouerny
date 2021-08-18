import java.util.Random ;

public class randClass {
	
	public static void main(String [] args) {
		
		Random random = new Random() ; 

		
		
		for(int i = 0 ; i < 10 ; i++) {
			int x = random.nextInt(10) + 1 ; 
			
			System.out.println("Random Number : " + x );
		
			
			
		}
				
	




	}
	
}
