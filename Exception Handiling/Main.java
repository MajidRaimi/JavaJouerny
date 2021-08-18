import java.util.Scanner ; 
import java.util.InputMismatchException;
public class Main { 
        public static void main(String[] args) {
                    
            Scanner scanner = new Scanner(System.in) ; 
            try {
               
            System.out.print("Enter Your First Number : ");
            int numOne = scanner.nextInt() ;    
            System.out.print("Enter Your Second Number : ");
            int numTwo = scanner.nextInt() ; 

            int answer = numOne / numTwo ; 

            System.out.println("Your Answer Is = " + answer);
            } 
            catch (ArithmeticException e) { // For Math Problems 
                System.out.println("You Can't Devide By Zero");
            }
            catch (InputMismatchException s){ // For Input Problems 
                System.out.println("Please Enter A Number");
            }
            catch (Exception e){ // For All Problems 
                System.out.println("Your Problem Is " + e);
            }
            finally { // This Will Always Work 
                System.out.println("This Will Always Print");
                scanner.close(); // Good Practice
            }


    }
}
