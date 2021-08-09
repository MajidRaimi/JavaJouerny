public class overloadedMethodsClass {
    public static void main(String[] args) {
        // Oberloaded Methods = Methods Thats Share The Same Name With Different Parameters 

        System.out.println(sum(10, 10 , 20));

        


    } // Main Method 

    static int sum(int a , int b){
        return a + b ; 
    }

    static int sum(int a , int b , int c){
        return a + b + c ; 
    }

    static int sum(int a , int b , int c , int d){
        return a + b + c + d ; 
    }










} // overloadedMethodsClass
