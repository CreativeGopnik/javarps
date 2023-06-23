import java.util.Scanner;
import java.util.Random;

public class hand {

    public static void main(String[] args) {

        Scanner userInput;
        int userHand;
        Random ran = new Random();
        int botChoice = ran.nextInt(3) + 1;

        //Menu

        System.out.println("==================================================");

        System.out.println(" ");

        System.out.println("### ROCK PAPER SCISSOR ###");

        System.out.println(" ");

        System.out.println("Its your turn to decide!");

        System.out.println(" ");

        System.out.println("Please choose your hand by using their number!");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissor");

        System.out.println(" ");

        //Player Choice

        userInput = new Scanner(System.in);
        userHand = userInput.nextInt();

        System.out.println(" ");

        switch (userHand) {

            case 1:
                System.out.println("Your choice is Rock");
                break;
            case 2:
                System.out.println("Your choice is Paper");
                break;
            case 3: System.out.println("Your choice is Scissor");
                break;
            default:
                System.out.println("Comrade, your choice not valid!");

                System.out.println(" ");

                System.out.println("==================================================");

                System.exit(0);

        }

        System.out.println(" ");

        System.out.println("Its my turn to decide!");

        System.out.println(" ");

        //Bot Choice

        switch (botChoice) {

            case 1:
                System.out.println("My choice is Rock");
                break;
            case 2:
                System.out.println("My choice is Paper");
                break;
            case 3:
                System.out.println("My choice is Scissor");

        }

        //Main Code

        System.out.println(" ");

        if (userHand == 1 && botChoice == 3 || userHand == 2 && botChoice == 1 || userHand == 3 && botChoice == 2) {

            System.out.println("You win!");

        } else if (userHand == 1 && botChoice == 2 || userHand == 2 && botChoice == 3 || userHand == 3 && botChoice == 1) {

            System.out.println("You lose!");

        } else if (userHand == 1 && botChoice == 1 || userHand == 2 && botChoice == 2 || userHand == 3 && botChoice == 3) {

            System.out.println("Its a draw!");

        } else {

            System.out.println("Somehow its error...");

        }

        System.out.println(" ");

        System.out.println("==================================================");

    }

}
