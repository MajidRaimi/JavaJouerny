import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        


        try{
            FileWriter writer = new FileWriter("FileWriter/fileWriter") ; 
            writer.write("Hello \nGuys!\n");
            writer.append("My Name Is Majid") ; // Will Put It At The End
            writer.close(); // To Save Is 
        } 
        catch (IOException e){
            System.out.println("Couldn't Find The File ");
        }


    }
}
