import java.util.ArrayList ; 
public class forEachClass {
    public static void main(String[] args) {

        /* Works Like (Python)
            for i in list : 
                print(i)
        */

        // String[] animals = {
        //     "Cat" , "Dog" , "Rat" , "Bird"
        // } ; 


        ArrayList<String> animals = new ArrayList<String>() ; 

        animals.add("Cat") ; 
        animals.add("Dog") ; 
        animals.add("Rat") ; 
        animals.add("Bird") ; 


         
        for(String i : animals){
            System.out.println(i);
        }




    } // Main Function
}  // forEachClass 
