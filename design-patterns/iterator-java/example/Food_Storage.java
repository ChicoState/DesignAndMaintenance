public class Food_Storage{
    private Food[] food_list = new Food[4];
    private int index = 0;
    public void add(Food f)
    {
        food_list[index] = f;
        index++;
    }

    public Food[] getFood()
    {
        return food_list;
    }
}