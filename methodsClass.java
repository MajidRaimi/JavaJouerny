public class methodsClass {
     
    public static void main(String[] args) {
        // Method = Is A Class Function 
       


        // hello("Majid", 19);

        // System.out.println(pow(5, 2));


    
       


    } // Main Function 

    // You Should Make It Static Cause The main() Funcion Is Static 
    static void hello(String name , int age){
        System.out.println("Hello " + name + "\nYou Are " + age + " Years Old");
    } // hello methos

    static int pow(int numberOne , int numberTwo){
        
        int answer = 1 ; 
        for (int i = 0 ; i < numberTwo ; i++){
            answer *= numberOne ; 
        }

        return answer ; 

    } // pow Metod 




} // methodsClass
