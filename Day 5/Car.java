public class Car {



    String name = "Mazda" ; 
    String model = "CX5" ; 
    int year = 2020 ; 
    String color = "Blue" ; 
    double price = 89000.00 ; 
 
 
    void drive(){
        System.out.println("You Drive The Car");
    }
 
 
    void stop(){
        System.out.println("You Stopped The Car");
    }
 
    // OverRide toString()
    public String toString(){
        return this.name  + "\n" + this.model + "\n" + this.color + "\n" + this.price + "\n" + this.year ; 
    }    



 
 }
 