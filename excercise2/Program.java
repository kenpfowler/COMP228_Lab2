package excercise2;
import javax.swing.JOptionPane;

public class Program {

    public static void main(String[] args) {
        //create assets
        Lotto LotteryGame = new Lotto();

        //create loop to play game
        while (LotteryGame.getPlays() != 0)
        {
        //get user entry
        int userEntry = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 3 and 27"));
        //play = match the sum of the users entry to sum of lotto numbers
            //If the users entry matches the sum of lotto numbers tell them they won
        if (userEntry == LotteryGame.sumOfLotto())
        {
            System.out.println("\n#####################################################\n");
            System.out.printf("The lottery number is: %d", LotteryGame.sumOfLotto());
            System.out.printf("\nYou chose the number: %d", userEntry);
            System.out.println("\nYOU WIN!");
            System.out.println("\n#####################################################\n");
            break;
        }
        else
        {
            //if user doesn't win, display message
            System.out.println("\n#####################################################");
            System.out.printf("\nThe lottery number was: %d", LotteryGame.sumOfLotto());
            System.out.printf("\nYou chose the number: %d", userEntry);
            //decrement plays
            LotteryGame.setPlays();
            //if user has 0 plays then computer wins
            if (LotteryGame.getPlays() == 0) {
                System.out.println("\nGame over, Computer wins.");
                System.out.println("\n#####################################################\n");
                //else tell them how many plays remain
            } else {
                System.out.printf("\nYou have %d/5 plays remaining\n", LotteryGame.getPlays());
                System.out.println("\n#####################################################\n");
            }
            //randomize lottery numbers before next play
            LotteryGame.randomize();
        }
    }
    }
}
