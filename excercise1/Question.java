package excercise1;
/*
 Develop a Java application that simulates a test.
 The test contains at least four questions about first three lectures of this course.
 Each question should be a multiple-choice question with 5 options.

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

        At the end of the test, display the number of correct and incorrect answers, and the percentage of the correct answers.
        Your main class will simply create a question object and start the test by calling getAnswer method. (5 marks)
*/


public class Question
{
    //array to store quiz questions
    private String[] _questions = {"What is a static method?", "", "", ""};
    private int _correctAnswers = 0;

    public Question()
    {

    }

    public String PrepareQuestion()
    {
        return "";
    }
    public  void TestAnswer()
    {

    }
    public void DisplayMessage()
    {

    }
    public void GetAnswer()
    {

    }
}
