package example;

public class play{
    public static void main(String[] args)
    {
        //Civilian = Player 1
        Civilian civilian = new Civilian();

        //Monster = Orc
        Orc orc = new Orc();
        civilian.attack(orc);

        //Warrior = Player 2
        Warrior warrior = new Warrior();
        warrior.attack(orc);
    }
}