package example;

abstract class action{
     monster monst;
    public action(monster m)
    {
        monst = m;
    }
    public action(){}
    abstract void attack(monster monst);
}



