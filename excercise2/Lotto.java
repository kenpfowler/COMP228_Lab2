package excercise2;
import java.util.Random;
/*

Exercise 2

Design a Lotto class with one array instance variable to hold three random integer values (from 1 to 9).
Include a constructor that randomly populates the array for a lotto object.
Also, include a method in the class to return the array.
Use this class to simulate a simple lotto game in which the user chooses a number between 3 and 27.
The user runs the lotto up to 5 times and each time the sum of lotto numbers is calculated.
If the number chosen by the user matches the sum, the user wins and the game ends.
If the number does not match the sum within five rolls, the computer wins.
Use methods of JOptionPane class to interact with the user. (3 marks)

*/

//create Lotto class
public class Lotto {

//initialize an array of to hold random integers
private int[] _numbers = {0, 0, 0};

//create constructor to populate objects _number field with random integers
public Lotto()
{
    //create object to create random numbers
    Random randomizer = new Random();
    for (int number: this._numbers) {
        //reassign each variable in _numbers array to random int between 1 & 9
        number = randomizer.nextInt(8) + 1;
    }
}

//create method to return array of random numbers
public int[] Numbers()
{
    return _numbers;
}

}
