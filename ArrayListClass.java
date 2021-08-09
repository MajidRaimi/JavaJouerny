import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        

        // You Must You Wrapper Class In ArrayList (String , Integer , Boolean , Character , Double)
        ArrayList<String> food = new ArrayList<String>() ;  


        // To Add Values ( Works Like food[0] = "Fries" ... etc )
        food.add("Fries") ; 
        food.add("Pizza") ; 
        food.add("Burger") ; 

        // To Replace ( Works Like food[1] = "HotDog")
        food.set(1, "HotDog") ; 

        // To Remove Values 
        food.remove(0) ; 

        // To Remove Everything 
        food.clear();


        // To Get The Length ( Work Likes food.length )  
        for(int i = 0 ; i < food.size() ; i++){
            // To Get The Values (Works Lie food[i])
            System.out.print(food.get(i) + "  ");
        }



        System.out.println();

    }
}
