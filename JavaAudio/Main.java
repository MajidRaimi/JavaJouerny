import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.*;
public class Main {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in) ; 
        File file = new File("JavaAudio/Modern Time - An Jone.wav") ; 
        try{
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file) ;
            Clip clip = AudioSystem.getClip() ; 
            clip.open(audioStream);

            
            String response = "" ; 

                System.out.println("1 - (P) To Play  The Music ");
                System.out.println("2 - (S) To Stop  The Music ");
                System.out.println("3 - (R) To Reset The Music ");
                System.out.println("4 - (Q) To Quit  The Music ");

            while(! response.equalsIgnoreCase("Q")){
                System.out.print("What Would You Like To Do : ");
                response = scanner.next() ; 
                if(response.equalsIgnoreCase("P")){
                    clip.start();
                } else if (response.equalsIgnoreCase("S")){
                    clip.stop();
                } else if (response.equalsIgnoreCase("R")){
                    clip.setMicrosecondPosition(0);
                } 
                else if (response.equalsIgnoreCase("Q")){
                    break ; 
                } else {
                    System.out.println("Wrong Input Try Again");
                }
               
            }
            



            clip.start();




        } 
        catch (Exception e){
            System.out.println("Couldn't Find The File");
        }


    }
}
