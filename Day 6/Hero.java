public class Hero extends Person {
    
    String power ; 


    Hero(String name , int age , String power){

        // "This" Works For This Class
        // "Super" Works For The Parents Class
        super(name , age); 
        this.power = power ; 


    }


    public String toString(){
        return super.toString() + " " + this.power ; 
    }



}
