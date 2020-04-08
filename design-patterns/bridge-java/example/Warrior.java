package example;

class Warrior extends action{
    private int level=20;
    Warrior()
    {
        System.out.println("You are a Warrior.");
    }
    int getLevel(){return level;}

    @Override
    void attack(monster monst) {
        System.out.println("Monster Details:");
        monst.getDetails();
        if(monst.getLevel()>getLevel())
        {
            System.out.println("Monster Level too high to Attack.\n");
        }else
        {
            System.out.println("Attacking the monster.\n");
        }
    }
}