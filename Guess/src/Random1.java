
import java.util.Random;
import java.util.Scanner;

public class Random1 {

    public static void main(String args[]) {
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(5);

        // Print random integers
        //System.out.println("Random Integers: " + rand_int1);

        for (int i = 1; i <= 3; i++) {


            Scanner user_number = new Scanner(System.in);
            System.out.println("enter number from 0 to 5");
            String userNumber = user_number.nextLine();
            System.out.println("your random number is: " + userNumber);

            int y = Integer.parseInt(userNumber);


            if (y == rand_int1) {
                System.out.println("YOU WIN");
                break;
            } else if (i == 3) {
                System.out.println("Out of chances");
            } else {
                System.out.println("Not this time");
            }
        }


    }
}