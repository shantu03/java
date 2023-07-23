//My code
package Harry;

import java.util.Random;
import java.util.Scanner;

public class exercise2{
    public static void main(String[] args) {
        while (true) {

            System.out.printf("\nEnter : %3c for Rock\t%3c for Paper\t%3c for Scissor  or ~ to exit",'r','p','s');
            char value=new Scanner(System.in).next().charAt(0);
            if(value=='~')
            {
                System.out.println("Thanks for playing");
                break;
            }
            else {
            random k=new random(value);}

        }
    }
}
class random{
    public random(char player)
    {
        String ran="rps";
        Random tc= new Random();
        char computer=ran.charAt(tc.nextInt(ran.length()));             //---> THIS IS BEST
        System.out.printf("Computer : %s\tPlayer : %s\n",computer,player);
        if(player==computer)
        {
            System.out.printf("\t----> Winner: Draw");
        } else if (player=='r' && computer =='p') {
            System.out.printf("\t----> Winner: Computer");
        } else if (player =='r' && computer=='s') {
            System.out.printf("\t----> Winner: Player");
        } else if (player=='s' && computer=='r') {
            System.out.printf("\t----> Winner: Computer");
        } else if (player=='s' && computer=='p') {
            System.out.printf("\t----> Winner: Player");
        } else if (player=='p' && computer=='s') {
            System.out.printf("\t---->> Winner: Computer");
        } else if (player=='p' && computer=='r') {
            System.out.printf("\t----> Winner: Player");
        }
        else System.out.println("invalid input");
        System.out.println("\n\n+++++++++++++++++++++++++++++++++++++");
    }

}

/*
CHAT GPT CODE

package Harry;
import java.util.Scanner;
        import java.util.Random;

public class exercise2 {

    public static void main(String[] args) {
        playRockPaperScissors();
    }

    public static void playRockPaperScissors() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("Welcome to Rock-Paper-Scissors Game!");
        System.out.println("Enter your choice: rock, paper, or scissors");

        while (true) {
            System.out.print("Your choice: ");
            String playerChoice = scanner.nextLine().toLowerCase();

            if (!isValidChoice(playerChoice)) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                continue;
            }

            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = choices[computerChoiceIndex];

            System.out.println("Computer's choice: " + computerChoice);

            String result = determineWinner(playerChoice, computerChoice);
            System.out.println(result);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Thank you for playing Rock-Paper-Scissors!");
        scanner.close();
    }

    public static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    public static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
                || (playerChoice.equals("paper") && computerChoice.equals("rock"))
                || (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "Congratulations! You win!";
        } else {
            return "Sorry, you lose! Better luck next time!";
        }
    }
}
*/