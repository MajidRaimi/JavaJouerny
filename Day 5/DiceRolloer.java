import java.util.Random;

public class DiceRolloer {
    // Global 
    Random random ;
    int number ;

    DiceRolloer() {
        // Local
        // Random random = new Random();
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

}
