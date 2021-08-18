import java.io.File ; 

public class Main {
    
    
   public static void main(String[] args) {
    File file = new File("FileClass/secretMessage.txt") ; 

    if(file.exists()){
        System.out.println("Working");
        System.out.println("The Path Of The File Is : " + file.getPath()); // What Was Written In The Constructor
        System.out.println("The Absolute Path Of The File Is : " + file.getAbsolutePath()); // The Full File Path
        System.out.println("Will Return True If Its A File : " + file.isFile()); // If Its Folder It Will Return False 
        // file.delete() ; // Will Delete It

    } else {
        System.out.println("Not Working");
    }



   }




} 
