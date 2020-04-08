package example;

public class Orc implements monster{

        String name="Orc";
        int health=1200;
        int damage=20;
        String sound="I am Orc!";
        int level=2;

    public String getName(){return name;}
    public int getHealth(){return health;}
    public int getDamage(){return damage;}
    public String getSound(){return sound;}
    Orc(){System.out.println("Facing an Orc.");}
        
    public int getLevel() {
        return level;
    }
        
        @Override
        public void getDetails() {
            System.out.println("Name: "+getName());
            System.out.println("Health: "+getHealth());
            System.out.println("Damage: "+getDamage());
            System.out.println("Sound: "+getSound());
            System.out.println("Level: "+getLevel());
        }
}