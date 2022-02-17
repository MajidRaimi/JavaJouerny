import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // JOptionPane = Pop Up Standard Dialog Box That Prompts Users For A Value Of A
        // Value
        // Or Inform Them Of Something

        JOptionPane.showMessageDialog(null, "Text", "Hi I Am Title", JOptionPane.ERROR_MESSAGE);

        // Type Of Massages
        /*
         * JOptionPane.PLAIN_MESSAGE
         * JOptionPane.INFORMATION_MESSAGE
         * JOptionPane.WARNING_MESSAGE
         * JOptionPane.QUESTION_MESSAGE
         * JOptionPane.ERROR_MESSAGE
         */

        String name = JOptionPane.showInputDialog(null, "What it You Name ?", "Title", JOptionPane.QUESTION_MESSAGE);

        int answer = JOptionPane.showConfirmDialog(null, "Please Say Yes", "Also Title",
                JOptionPane.YES_NO_CANCEL_OPTION);

        ImageIcon icon = new ImageIcon("") ; 

        String [] responses = {
            "Yes" , "No" , "Don't Want To Answer"
        } ; 

        JOptionPane.showOptionDialog(null, "Are You CCSIT ? ", "Small Question" , JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.INFORMATION_MESSAGE , icon , responses , 0 ) ; 


    }
}