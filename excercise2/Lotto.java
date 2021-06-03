package excercise2;
import javax.swing.JOptionPane;
import java.util.Random;

//create Lotto class
public class Lotto {

//initialize an array of to hold random integers
private int[] _numbers = {0, 0, 0};
private int _plays = 5;

//create getter for numbers array, number of plays
public int[] getNumbers()
{
    return _numbers;
}

public int getPlays()
{
    return _plays;
}

public void setPlays()
{
    _plays--;
}

//create constructor to populate objects _number field with random integers
public Lotto()
{
    //create a random number generator
    Random randomizer = new Random();
    //assign new values to the numbers array
    for (int i = 0; i < this._numbers.length; i++) {
        this._numbers[i] = randomizer.nextInt(9) + 1;
    }
}

//find sum of numbers array
    public  int sumOfLotto()
    {
        int sum = 0;
        //accumulate lotto numbers in variable
        for (int i = 0; i < getNumbers().length; i++)
        {
            sum += getNumbers()[i];
        }
        //return that variable
        return sum;
    }

//randomize lotto numbers
public void randomize()
{
    //create a random number generator
    Random randomizer = new Random();
    //assign new values to the numbers array
    for (int i = 0; i < this._numbers.length; i++) {
        this._numbers[i] = randomizer.nextInt(9) + 1;
    }
}

//display feedback on win
    public void feedbackOnWin(int result, int userEntry)
    {
        String message = "\n#####################################################\n";
        message += String.format("\nThe lottery number is: %d", result);
        message += String.format("\nYou chose the number: %d", userEntry);
        message += "\nYOU WIN!\n\n#####################################################\n";
        JOptionPane.showMessageDialog(null, message);
    }

//display feedback on loss
    public void feedbackOnLoss(int result, int userEntry)
    {
        //construct message
        String message = "\n#####################################################\n";
        message += String.format("\nThe lottery number was: %d", result);
        message += String.format("\nYou chose the number: %d", userEntry);

        //decrement plays
        this.setPlays();

        //if user has 0 plays then computer wins
        if (this.getPlays() == 0) {
            message += "\nGame over, Computer wins.\n#####################################################\n";
            //else tell them how many plays remain
        } else {
            message += String.format("\nYou have %d/5 plays remaining\n", this.getPlays());
            message += "\n#####################################################\n";
        }
        //Show dialogue box
        JOptionPane.showMessageDialog(null, message, "Result!", JOptionPane.PLAIN_MESSAGE);
    }
};
