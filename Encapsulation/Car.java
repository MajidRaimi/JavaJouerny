public class Car {

    private String make ; 
    private String  model ; 
    private int year ; 


    Car(String make , String model , int year){
        // You Can Use Both Ways   
        this.setMake(make);  
        this.setModel(model);
        this.setYear(year);
    }


    // --- Getter Method --- 
    public String getMake(){
        return make ; 
    }

    public String getModel(){
        return model ; 
    }


    public int getYear(){
        return year ; 
    }



    // --- Setter Method --- 


    public void setYear(int year){
        this.year = year ; 
    }

    public void setMake(String make){
        this.make = make ; 
    }

    
    public void setModel(String model){
        this.model = model ; 
    }


   // --- Copy Method --- 

   public void copy(Car car){
       this.setMake(car.make);
       this.setModel(car.model);
       this.setYear(car.year);
   }

   // --- Overloading Copy Constructor --- 

   Car( Car car ){
        this.copy(car);
   }





}
