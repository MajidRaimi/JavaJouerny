import java.util.*;

public class TwoDArrayList {
    public static void main(String[] args){

        // First List 
        ArrayList<String> bakeryList = new ArrayList<String>() ;

        bakeryList.add("Pasta") ; 
        bakeryList.add("Garlic Bread") ;
        bakeryList.add("Donuts") ;


       // Second List 
       ArrayList<String> produceList = new ArrayList<String>() ; 

        produceList.add("Tomatoes") ; 
        produceList.add("Zucchini") ; 
        produceList.add("Peppers") ; 

        //Third List 
        ArrayList<String> drinksList = new ArrayList<String>() ;  

        drinksList.add("Soda") ; 
        drinksList.add("Coffe") ; 

        // Make TwoDArrayList 
        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>() ; 
        // Add The Lists To The 2DList 
        groceryList.add(bakeryList) ; 
        groceryList.add(produceList) ;
        groceryList.add(drinksList) ;


        // To Get One Item 
        // System.out.println(groceryList.get(0).get(0));


        // To Print All 
        for(int i = 0 ; i < groceryList.size() ; i++){
            for(int j = 0 ; j < groceryList.get(i).size() ; j++){
                System.out.print(groceryList.get(i).get(j) + "  ");
            }
            System.out.println();
        }



    } // Main Function


} // TwoDArrayList Class
