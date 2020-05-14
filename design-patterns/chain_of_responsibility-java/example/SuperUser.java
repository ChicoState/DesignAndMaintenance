public class SuperUser extends User {
    private int userLevel;

    SuperUser(int lvl)
    {
        userLevel = lvl;
    }
    @Override
    public Boolean isAllowed() {
        if(userLevel > 5)
        {
            return true;
        }else
        {
            return false;
        }
    }

    @Override
    public void execute(String C) {
        if(isAllowed()==true)
        {
            System.out.println("Authorization Success.");
            System.out.println("Executing "+C);
        }
        else
            System.out.println("Not Authorized to execute "+C);
    }
}