package excercise1;

public class Program
{
    public static void main(String[] args)
    {
        Question quiz = new Question();
        for (int i = 0; i < quiz.getQuestions().length; i++)
        {
            quiz.GetAnswer(quiz.PrepareQuestion(i));
            quiz.TestAnswer(i);
            quiz.DisplayMessage();
        }
    }
}
