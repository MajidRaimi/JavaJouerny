public class Main{
    public static void main(String[] args) {
        
        Car car = new Car() ; 
        Bicycle bike = new Bicycle() ; 
        Boat boat = new Boat() ; 

//    They All Extends Vehicle 
       Vehicle[] racers = {
            car , bike , boat
        } ; 


        for( Vehicle x : racers ){
            x.go();
        }


    }
}