package excercise3;

/*

Exercise 3

- [] Define a Java class “Player” that implements a set of three overloaded static methods.
- [] The methods should have different set of parameters and perform similar functionalities.
- [] Call the methods within main method and display the results. (2 marks)

*/

// create Player class
public class Player
{
 //create customizable movement methods
    public static String move()
    {
        return "Player moves";
    }
    public static String move(String direction)
    {
        String movement = String.format("Player moves %s", direction);
        return movement;
    }
    public static String move(String direction, String adjective)
    {
        String movement = String.format("Player moves %s %s", direction, adjective);
        return movement;
    }

    //create voice action methods
    public static String speak()
    {
        return "Player says: Who wants some?";
    }
    public static String speak(boolean taunt)
    {
        return "Player says: You can't win this one";
    }
    public static String speak(boolean victory, boolean taunt)
    {
        return "Player says: That was too easy!";
    }

    //create action methods
    public static String useWeapons()
    {
        return "Player fires weapon";
    }
    public static String useWeapons(boolean takeAim)
    {
        return "Player aims and fires weapon";
    }
    public static String useWeapons(boolean takeAim, boolean useCover)
    {
        return "Player fires weapon from cover";
    }

}

