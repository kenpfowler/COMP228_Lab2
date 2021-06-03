package excercise1;
import javax.swing.JOptionPane;
import java.util.Random;
import java.text.DecimalFormat;

/*
Issues
Optimize to use getters and setters instead of accessing directly.
try to refactor lines that can be encapsulated in a method
*/

public class Question
{
    ////Constant Variables
    //array to store quiz questions
    private final String[] _questions =
            {
                    "What is a static method?",
                    "Classes should use the ___ casing convention",
                    "What does the term JDK stand for?",
                    "What is a package in Java"
            };

    //array to store quiz answers
    private final String[] _answers =
            {
                    "A method that can be used without creating an instance of its class,A method that leaves the program in a static state,A method that can only be used by first instantiating an object of the methods class,A method that is derived from the 'Static' class,A method that never changes",
                    "What convention? There is no convention for classes,classes should use camelCase,classes should use PascalCase,They should be kebab-case. Mmmhhh kebab-case,They should be SNAKE_UPPERCASE",
                    "Java Deployment Kit,Java Development Kit,Java Debugging Kit,JavaScript Development Kit,Java Demolition Kit",
                    "A package is a place to store data that wont be used,Packages are for data that will be sent to the client,Packages are only used by Amazon,Packages are like a namespace; they group together a set of classes,Packages are only for third-party libraries"
            };

    //store the feedback for correct and incorrect answers
    private final String[] _isCorrectMessage = {"Excellent!", "Keep up the good job!", "Well done!"};
    private final String[] _isIncorrectMessage = {"Wrong. Please try again", "No. Keep trying..", "No. Another attempt"};

    //key to the correct answers
    private final int[] _answerKey = {1, 3, 2, 4};

    ////Variables to track the state of the Question class
    //store the number of correct answers
    private int _correctAnswers = 0;

    //store current user input
    private int _userInput = 0;

    //store if user was correct for current round
    private boolean _isCorrect = false;

    //track which question the user is on
    private int _getQuestionNumber = 0;

    // get the current question number
    public int getQuestionNumber()
    {
        return _getQuestionNumber;
    }

    //get the array of questions
    public String[] getQuestions()
    {
        return _questions;
    }

    //get the array of answers
    public String[] getAnswers()
    {
        return _answers;
    }

    //get and set the users input
    public int getUserInput()
    {
        return _userInput;
    }
    public void setUserInput(int value)
    {
        _userInput = value;
    }

    //get and set the number of correct answers
    public int getNumberOfCorrectAnswers()
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
    public String prepareQuestion()
    {
        //get the first question
        String dialogue = getQuestions()[this.getQuestionNumber()];

        //get the answers
        String[] answers = getAnswers()[this.getQuestionNumber()].split(",", 0);

        //format each answer and add to the dialogue
        for (int i = 0; i < answers.length; i++)
        {
           dialogue += String.format("\n %d. %s\n", (i + 1), answers[i]);
        }

        //ask user to enter a response

        dialogue += "\nPlease enter the number attached to your answer (1 - 5):";

        return dialogue;
    }

    public void testAnswer()
    {
        //compare users answer with correct answer
        if (this.getUserInput() == this._answerKey[this.getQuestionNumber()])
        {
            //increment score if the answer is correct
            setCorrectAnswers();
            this._isCorrect = true;
        }
    }

    public void displayMessage()
    {
        Random randomizer = new Random();

        switch (randomizer.nextInt(3))
        {
            case 0:
                if (this._isCorrect)
                {
                    displayFeedbackCorrectAnswer(0);
                }
                else
                {
                    displayFeedbackIncorrectAnswer(0);
                }
                break;
            case 1:
                if (this._isCorrect)
                {
                    displayFeedbackCorrectAnswer(1);
                }
                else
                {
                    displayFeedbackIncorrectAnswer(1);
                }
                break;
            case 2:
                if (this._isCorrect)
                {
                    displayFeedbackCorrectAnswer(2);
                }
                else
                {
                    displayFeedbackIncorrectAnswer(2);
                }
                break;
        }

        //reset flag variable and increment question number
        this._isCorrect = false;
        this._getQuestionNumber++;
        //show user a summary of their results
        if (this._getQuestionNumber == (getQuestions().length))
        {
            JOptionPane.showMessageDialog(null, String.format("Test Over. Here are your results:\nScore: %d/%d ( %s )", getNumberOfCorrectAnswers() , getQuestions().length, calculateScoreInPercent() ));
        }
    }

    //this method will be called in the driver class to initiate question.
    public void getAnswer(String dialogue)
    {
        //display questions to user and accept input
        setUserInput(Integer.parseInt(JOptionPane.showInputDialog(null, dialogue, "Java Quiz", JOptionPane.PLAIN_MESSAGE)));
    }

    //method to calculate the test score in percent
    public String calculateScoreInPercent()
    {
        DecimalFormat decFormat = new DecimalFormat("#%");
        decFormat.format((float) this.getNumberOfCorrectAnswers()/(float)getQuestions().length);
        return decFormat.format((float) this.getNumberOfCorrectAnswers()/(float)getQuestions().length);

    }

    //method to give feedback for a correct answer
    public void displayFeedbackCorrectAnswer(int num)
    {
        JOptionPane.showMessageDialog(null, _isCorrectMessage[num]);
    }

    //method to give feedback for incorrect answer
    public void displayFeedbackIncorrectAnswer(int num)
    {
        String[] answers = getAnswers()[this.getQuestionNumber()].split(",", 0);
        String message = answers[_answerKey[this.getQuestionNumber()] - 1];
        JOptionPane.showMessageDialog(null, String.format("%s\nThe correct answer is: %s", _isIncorrectMessage[2], message));
    }
}
