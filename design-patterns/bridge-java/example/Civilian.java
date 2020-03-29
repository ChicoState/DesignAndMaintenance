package example;

class Civilian extends action{
    private int level=1;
    Civilian()
    {
        System.out.println("You are a Civilian.");
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
