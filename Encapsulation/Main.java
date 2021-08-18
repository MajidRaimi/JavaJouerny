public class Main{
    public static void main(String[] args) {
        
        Car car1 = new Car("Mazda" , "CX5" , 2020) ; 
      //  Car car2 = new Car("Ford" , "Turis" , 2019) ; 
        Car car2 = new Car(car1) ; 
        

        System.out.println("Before Coppying");
        System.out.println("Adrees Of Car1 : " + car1);
        System.out.println("Adrees Of Car2 : " + car2);
        System.out.println("Car 1 : " + car1.getMake() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println("Car 2 : " + car2.getMake() + " " + car2.getModel() + " " + car2.getYear());
        System.out.println();

        car2.copy(car1);


        System.out.println("After Coppying");
        System.out.println("Adrees Of Car1 : " + car1);
        System.out.println("Adrees Of Car2 : " + car2);
        System.out.println("Car 1 : " + car1.getMake() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println("Car 2 : " + car2.getMake() + " " + car2.getModel() + " " + car2.getYear());
        System.out.println();



        // Why Don't We 
        // car1 = car2 ;  ? 
        // Cause The Will Share The Same Adress 
        // Soooo We Should Make copy() method 
        
        car1 = car2 ; 

        System.out.println("If We Used car1 = car2");
        System.out.println("Adrees Of Car1 : " + car1);
        System.out.println("Adrees Of Car2 : " + car2);
        System.out.println("Car 1 : " + car1.getMake() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println("Car 2 : " + car2.getMake() + " " + car2.getModel() + " " + car2.getYear());
        System.out.println();


    }
}