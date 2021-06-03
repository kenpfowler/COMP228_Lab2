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
        int userEntry = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number between 3 and 27", "Lottery!",JOptionPane.PLAIN_MESSAGE));
        //play = match the sum of the users entry to sum of lotto numbers
            //If the users entry matches the sum of lotto numbers tell them they won
        if (userEntry == LotteryGame.sumOfLotto())
        {
            LotteryGame.feedbackOnWin(LotteryGame.sumOfLotto(), userEntry);
            break;
        }
        else
        {
            //if user doesn't win, display message
            LotteryGame.feedbackOnLoss(LotteryGame.sumOfLotto(), userEntry);
            //randomize lottery numbers before next play
            LotteryGame.randomize();
        }
    }
    }
}
