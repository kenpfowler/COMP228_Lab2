package excercise2;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Program {

    public static void main(String[] args) {
        JOptionPane Lottery = new JOptionPane();
    String entry = JOptionPane.showInputDialog("Enter a number between...");
    Lotto test = new Lotto();
    System.out.println(Arrays.toString(test.RandomNumbers()));
    }
}
