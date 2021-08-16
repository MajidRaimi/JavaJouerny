public class Bicycle extends Vehicle {
    
     int wheels = 2 ;
     int pedals = 2 ; 
     
   
     @Override
     void go(){
          System.out.println("This Bike Is Moving !");
      }
  
      void stop(){
          System.out.println("This Bike Is Stopping !");
      }
  

}
