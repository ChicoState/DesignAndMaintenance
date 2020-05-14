import java.util.Iterator;

public class FoodIterator implements Iterator<Food>{

    private Food[] food_list;
    private int index=0;

    public FoodIterator(Food[] food_list){
        this.food_list = food_list;
    }

    @Override
    public boolean hasNext() {
        if(index>=food_list.length || food_list[index]==null)
        return false; 
        else
        return true;
    }

    @Override
    public Food next() {
        return food_list[index++];
    }
    
}