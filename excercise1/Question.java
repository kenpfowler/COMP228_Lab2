package excercise1;
import javax.swing.JOptionPane;
import java.util.Random;

/*
- [] Develop a Java application that simulates a test.
- [] The test contains at least four questions about first three lectures of this course.
- [] Each question should be a multiple-choice question with 5 options.

 Define a Question class. Use programmer-defined methods to implement your solution. For example:
        define a method to prepare the questions – prepareQuestion
        define a method to test the answer – testAnswer
        define a method to display a random message for the user – displayMessage
        define a method to interact with the user - getAnswer
        Display the questions using methods of JOptionPane class. Use a loop to show all the questions.

        For each question:

        - [ ] If the user finds the right answer, display a random congratulatory message (“Excellent!”, ”Keep up the good job!”, or “Well done!”).
        - [ ] If the user responds incorrectly, display an appropriate message, and the correct answer (“Wrong. Please try again”, “No. Keep trying..”, "No. Another attempt).
        - [ ] Use random-number generation to choose a number from 1 to 3 that will be used to select an appropriate response to each answer.
        - [ ] Use a switch statement to issue the responses, as in the following code:

``` java
switch ( randomObject.nextInt( 3 ) )

        {

        case 0:

        return( "Excellent!" );

        }
        ```

        - [] At the end of the test, display the number of correct and incorrect answers, and the percentage of the correct answers.
        - [] Your main class will simply create a question object and start the test by calling getAnswer method. (5 marks)
*/


public class Question
{
    //array to store quiz questions
    private final String[] _questions =
            {
                    "What is a static method?",
                    "Classes should use the ___ casing convention",
                    "What does the term JDK stand for?",
                    "The %d symbol can be used in a variety of methods to interpolate a string"
            };

    //array to store quiz answers
    private final String[] _answers =
            {
              "A method that can be used without creating an instance of its class,A method that leaves the program in a static state,A method that can only be used by first instantiating an object of the methods class,A method that is derived from the 'Static' class,A method that never changes"
            };

    //store the feedback for correct and incorrect answers
    private final String[] _isCorrectMessage = {"Excellent!", "Keep up the good job!", "Well done!"};
    private final String[] _isIncorrectMessage = {"Wrong. Please try again", "No. Keep trying..", "No. Another attempt"};

    //key to the correct answers
    private final int[] _answerKey = {0};

    //store the number of correct answers
    private int _correctAnswers = 0;

    //store current user input
    private int _userInput = 0;

    //store if user was correct for current round
    private boolean _isCorrect = false;

    // getter and setters
    public String[] getQuestions()
    {
        return _questions;
    }

    public String[] getAnswers()
    {
        return _answers;
    }

    public int getUserInput()
    {
        return _userInput;
    }
    public void setUserInput(int value)
    {
        _userInput = value;
    }
    public int getCorrectAnswers()
    {
        return _correctAnswers;
    }
    public void setCorrectAnswers()
    {
        _correctAnswers++;
    }

    //Constructor
    public Question()
    {

    }

    //method to display quiz questions to user
    public void PrepareQuestion()
    {
        //get the first question
        String dialogue = getQuestions()[0];

        //get the answers
        String[] answers = getAnswers()[0].split(",", 0);

        //format each answer and add to the dialogue
        for (int i = 0; i < answers.length; i++)
        {
           dialogue += String.format("\n %d. %s\n", (i + 1), answers[i]);
        }

        //ask user to enter a response

        dialogue += "\nPlease enter the number attached to your answer (1 - 5):";

        setUserInput(Integer.parseInt(JOptionPane.showInputDialog(null, dialogue, "Java Quiz", JOptionPane.PLAIN_MESSAGE)));
    }

    public void TestAnswer()
    {
        //compare users answer with correct answer
        if (this.getUserInput() == this._answerKey[0])
        {
            //increment score if the answer is correct
            setCorrectAnswers();
            this._isCorrect = true;
        }
    }

    public void DisplayMessage()
    {
        Random randomizer = new Random();

        switch (randomizer.nextInt(3))
        {
            case 0:
                if (this._isCorrect)
                {
                   JOptionPane.showMessageDialog(null, _isCorrectMessage[0]);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, _isIncorrectMessage[0]);

                }
                break;
            case 1:
                if (this._isCorrect)
                {
                    JOptionPane.showMessageDialog(null, _isCorrectMessage[1]);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, _isIncorrectMessage[1]);

                }
                break;
            case 2:
                if (this._isCorrect)
                {
                    JOptionPane.showMessageDialog(null, _isCorrectMessage[2]);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, _isIncorrectMessage[2]);

                }
                break;
        }
        this._isCorrect = false;
    }

    //this method will be called in the driver class to initiate the quiz loop.  All other methods used within
    public void GetAnswer()
    {

    }
}
