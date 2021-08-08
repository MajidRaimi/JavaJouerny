
import java.util.Scanner ; 

public class TwoDArray {
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in) ; 
		
		
		//String[][] names = new String[row][col] ; 
		
		
		
		String[][] cars = {
				{"Mazda" , "Ford" , "Hundai"} , 
				{"BMW" , "Jagwar" , "MC"} , 
				{"Nissan" , "KIA" , "Charger"}
		} ; 
	
		for(int i = 0 ; i < cars.length ; i++) {
			for(int j = 0 ; j < cars[i].length ; j++) {
				System.out.print(cars[i][j] + "  ");
			}
			System.out.println();
		}
		
	} // Main Function 
	
} // Main Class
