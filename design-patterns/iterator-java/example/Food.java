public class Food{
    private int id;
    private String name;

    public Food(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}