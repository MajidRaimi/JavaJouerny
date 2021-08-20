package Main;
public class UserClass {
    
    String name ; 
    String username ; 
    String email ; 
    String password ; 


    UserClass(String name , String username , String email , String password){
        this.name = name ; 
        this.username = username ; 
        this.email = email ; 
        this.password = password ; 
    }


    @Override
    public String toString(){
        return this.name + " " + this.username + " " + this.email + " " + this.password ; 
    }


}
