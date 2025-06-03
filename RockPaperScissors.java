import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random rand = new Random();
        int index = rand.nextInt(3);
        return choices[index];
    }

    public static String getResult(String user, String computer) {
        if (user.equals(computer)) {
            return "It's a tie!";
        } else if (
            (user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))
        ) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();

        while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.print("Invalid input. Try again: ");
            userChoice = scanner.nextLine().toLowerCase();
        }

        String computerChoice = getComputerChoice();

        System.out.println("You chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);

        String result = getResult(userChoice, computerChoice);
        System.out.println(result);

        scanner.close();
    }
}