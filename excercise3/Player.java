package excercise3;

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

