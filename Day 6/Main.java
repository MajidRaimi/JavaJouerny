public class Main {
    public static void main(String[] args) {
        
        
        
        Car car = new Car() ; 
        Bicycle bike = new Bicycle() ; 

        System.out.println("Extends The Speed And Methods From The Parent Class (Vehicle) " + car.speed + " " + bike.speed);
        car.go();
        bike.stop();


        System.out.println(car.doors);
        System.out.println(bike.pedals);
       
        // (X) System.out.println(car.pedals);
        // (X) System.out.println(bike.doors);
       


        
        
        
        
        // --- Overriding --- 
        
    
        
        Dog dog = new Dog() ; 
        Animal animal = new Animal() ; 

        dog.speak() ; // Overriding
        animal.speak(); // Not Overriding



        // --- Super ---


        Hero hero1 = new Hero("Batman" , 42  , "Money") ; 
        Person me = new Person("Majid", 19) ;  


        System.out.println(hero1.toString());
        System.out.println(me.toString());

        // --- Abstract ---

        // You Cannot Because It's Abstract Class 
        // Vehicle vehicle = new Vehicle() ; 


    }
}
 