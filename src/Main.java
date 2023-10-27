import java.util.Random;
import java.util.Scanner;
class CrapsSimulator

{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Craps game!");

        while (true)
        {
            System.out.println("\nPress Enter to roll the dice...");
            scanner.nextLine();

            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.printf("You rolled: %d + %d = %d%n", die1, die2, sum);

            if (sum == 2 || sum == 3 || sum == 12)
            {
                System.out.println("Craps! You lost.");
            }
            else if (sum == 7 || sum == 11)
            {
                System.out.println("Natural! You won.");
            }
            else
            {
                System.out.printf("Point is %d. Keep rolling.%n", sum);

                while (true)
                {
                    System.out.println("Press Enter to roll again...");
                    scanner.nextLine();

                    die1 = random.nextInt(6) + 1;
                    die2 = random.nextInt(6) + 1;
                    int newSum = die1 + die2;

                    System.out.printf("You rolled: %d + %d = %d%n", die1, die2, newSum);

                    if (newSum == sum)
                    {
                        System.out.println("Made the point! You won.");
                        break;
                    }
                    else if (newSum == 7)
                    {
                        System.out.println("Got a seven and lost.");
                        break;
                    }
                    else
                    {
                        System.out.println("Trying for the point.");
                    }

                }

            }

            System.out.print("Play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;

            }

        }

        System.out.println("Thanks for playing Craps!");
    }

}