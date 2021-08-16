public class Car extends Vehicle {
    

    int wheels = 4 ; 
    int doors = 4 ; 


    @Override
    void go(){
        System.out.println("This Car Is Moving !");
    }

    void stop(){
        System.out.println("This Car Is Stopping !");
    }


}
