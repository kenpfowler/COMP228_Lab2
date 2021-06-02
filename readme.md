### Lab Assignment 2 - Developing Java application by implementing methods
### Due Date: June 06, 2021 at 11:59 pm.

#### Purpose: The purpose of this Lab assignment is to:
* Practice the use of instance methods in Java classes
* Practice the use of static methods in Java classes

---

### References: Learning materials for week 3, textbook, and other references (if any)
### Requirements Checklist
- [ ] Each exercise should be placed in a separate package named exercise1, exercise2, etc.

- [ ] You will have to demonstrate your solution in a scheduled lab session and submitting the code through dropbox link on eCentennial.

- [ ] You must name your Eclipse project according to the following rule:
  * YourFullName_COMP228Labnumber
  *  Example: JohSmith_COMP228Lab2
    
- [ ] Submit your assignment in a zip file that is named according to the following rule:
    * YourLastName_COMP228Labnumber.zip
    * Example: JohSmith_COMP228Lab2.zip

- [ ] Apply the naming conventions for variables, methods, classes, and packages:
    * variable names start with a lowercase character
    * classes start with an uppercase character
    * packages use only lowercase characters
    * methods start with a lowercase character

---

### Exercise 1
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

Exercise 2
- [x] Design a Lotto class with one array instance variable to hold three random integer values (from 1 to 9).
- [x] Include a constructor that randomly populates the array for a lotto object.
- [x] Also, include a method in the class to return the array.
- [x] Use this class to simulate a simple lotto game in which the user chooses a number between 3 and 27.
- [x] The user runs the lotto up to 5 times and each time the sum of lotto numbers is calculated.
- [x] If the number chosen by the user matches the sum, the user wins and the game ends.
- [x] If the number does not match the sum within five rolls, the computer wins.
- [x] Use methods of JOptionPane class to interact with the user. (3 marks)

Exercise 3
Define a Java class “Player” that implements a set of three overloaded static methods. 
The methods should have different set of parameters and perform similar functionalities. 
Call the methods within main method and display the results. (2 marks)  