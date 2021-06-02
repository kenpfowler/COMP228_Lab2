package excercise2;
import java.util.Random;

/*

Exercise 2

- [x] Design a Lotto class with one array instance variable to hold three random integer values (from 1 to 9).
- [x] Include a constructor that randomly populates the array for a lotto object.
- [x] Also, include a method in the class to return the array.
- [x] Use this class to simulate a simple lotto game in which the user chooses a number between 3 and 27.
- [x] The user runs the lotto up to 5 times and each time the sum of lotto numbers is calculated.
- [x] If the number chosen by the user matches the sum, the user wins and the game ends.
- [x] If the number does not match the sum within five rolls, the computer wins.
- [x] Use methods of JOptionPane class to interact with the user. (3 marks)

*/

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
    public  int SumOfLotto()
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
public void Randomize()
{
    //create a random number generator
    Random randomizer = new Random();
    //assign new values to the numbers array
    for (int i = 0; i < this._numbers.length; i++) {
        this._numbers[i] = randomizer.nextInt(9) + 1;
    }
}
};
