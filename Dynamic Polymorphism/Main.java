import java.util.Scanner ; 

public class Main {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in) ; 
        Animal animal ; 

        System.out.println("What Animal Do You Want : ");
        System.out.print("( 1 = Dog ) Or ( 2 = Cat ) : ");
        int choice = scanner.nextInt() ; 
        
        
        switch(choice){
            case 1 : 
                animal = new Dog() ; 
                break ;
                
            case 2 : 
                animal = new Cat() ; 
                break ; 

            default : 
                animal = new Animal() ; 
                break ; 
        }
        

        animal.speak();


    }
}
