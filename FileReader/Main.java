import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Character> name = new  ArrayList<Character>() ; 

      try {
        FileReader reader = new FileReader("FileReader/fileReader.txt") ; 
        int data = reader.read() ;

        while(data != -1){
            name.add((char)data) ; 
            data = reader.read() ; 
        }

        System.out.println(name);
        reader.close();
      }
      catch (Exception e){
          System.out.println("Couldn't Find The File");
      }


    }
}
