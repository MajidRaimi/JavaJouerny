package Main;
import java.io.* ;
import java.util.ArrayList;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ; 
        ArrayList<UserClass> userList = new ArrayList<UserClass>() ; 


            String name = " " ;
            String username = " " ; 
            String email = " " ; 
            String password = " " ; 

            String path = "Data.csv" ; 
            String line = "" ;

        try{
            FileReader file = new FileReader(path) ; 
            BufferedReader br = new BufferedReader(file) ; 


            while( ( line = br.readLine() ) != null ){
                String[] value = line.split(",") ; 
                //System.out.println(value[0]);
                name = value[0] ;
                username = value[1] ; 
                email = value[2]  ;
                password = value[3] ; 
                UserClass newUser = new UserClass(name, username, email, password) ; 
                userList.add(newUser) ; 
            }


        } catch(Exception e){
            
            
        }



        System.out.print("Please Enter Your Username : ");
        String usernameInput = scanner.next() ; 
        System.out.print("Please Enter Your Password : ");
        String passwordInput = scanner.next() ; 


        int loginIndex = -1 ; 
        for(int i = 0 ; i < userList.size() ; i++){

            
            
            if( (userList.get(i).username.equals(usernameInput.trim()) ) &&  (userList.get(i).password.equals(passwordInput.trim()) )  ){
                System.out.println("Login");
                loginIndex = i ; 
                break ; 
            }


        }

        if(loginIndex >= 0 ){
            System.out.println(userList.get(loginIndex).toString());
        } 
        else {
            System.out.println("Wrong Input Please Try Again Later");
        }



    }
}