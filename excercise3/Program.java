package excercise3;

//create program to exercise static methods
public class Program
{
    public static void main(String[] args)
    {
        //print storyline using the Player classes methods
    System.out.printf
            (
                    "GAME STARED:\n %s\n %s\n %s\n %s\n %s\n %s\n %s\n %s\n %s\n",
                    Player.move(),
                    Player.useWeapons(),
                    Player.speak(),
                    Player.move("left"),
                    Player.useWeapons(true,true),
                    Player.speak(true),
                    Player.move("forward", "quickly"),
                    Player.useWeapons(true),
                    Player.speak(true,true)
            );
    }

}
