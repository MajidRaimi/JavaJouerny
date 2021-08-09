public class printfClass {
    public static void main(String[] args) {

        // printf() = An Optional Method To Control , Format , And Display Text To The Window 
        //            Two Anguments(Parameters) = Format String + ( Object / Variable / Value )
        //            % [ Flags ] [ Precision ] [ Width ] [ Conversion-Character ]


        boolean myBool = true ; 
        char myChar = '@' ; 
        String myString = "Majid" ; 
        int myInt = 123 ; 
        double myDouble = 3.14 ; 
        double myDoubleNegative = -3.14 ; 
        

        // [ Conversion-Character ]
        System.out.printf("%b \n" , myBool);
        System.out.printf("%c \n" , myChar);
        System.out.printf("%s \n" , myString);
        System.out.printf("%d \n" , myInt);
        System.out.printf("%f \n" , myDouble);


        /*
            boolean --> %b 
            char -----> %c
            String ---> %s 
            int ------> %d 
            double ---> %f
        */


        System.out.println("\n-----------------------------------------\n");


        // [ Width ]
        System.out.printf("Hello %10s \n" , myString); // Put Some Spaces 
        System.out.printf("Hello %-10s \n" , myString); // Will Go To The Left But The Extra Space Will Go To The Right 

        

        System.out.println("\n-----------------------------------------\n");


        // [ Precision ]

        System.out.printf("Without Percision : %f \n" , myDouble);
        System.out.printf("With Percision : %.2f" , myDouble);


        System.out.println("\n-----------------------------------------\n");


        // [ Flags ]


        System.out.printf("Using The + : %+f \n" , myDouble);
     //   System.out.printf("Using The - : %-f" , myDoubleNegative);
        System.out.printf("Padding With Zero %020f \n" , myDouble); // Used To Pad With Zero
        System.out.printf("If You Are Having A Number Bigger Than 999 You Can Put ',' : %,d \n" , 1000000);



        System.out.println();
    } // Main Method 
} // printfClass 
