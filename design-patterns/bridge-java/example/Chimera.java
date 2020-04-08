package example;

public class Chimera implements monster{

        String name="Chimera";
        int health=5000;
        int damage=120;
        String sound="I am Chimera!";
        int level=10;

    public String getName(){return name;}
    public int getHealth(){return health;}
    public int getDamage(){return damage;}
    public String getSound(){return sound;}   
    Chimera(){System.out.println("Facing a Chimera");}

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