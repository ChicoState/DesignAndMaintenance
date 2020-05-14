public class main{
    public static void main(String [] args)
    {
        Food banana = new Food(1,"Banana");
        Food apple = new Food(2,"Apple");
        Food rice = new Food(3,"Rice");
        Food milk = new Food(4,"Milk");

        Food_Storage storage = new Food_Storage();
        storage.add(banana);
        storage.add(apple);
        storage.add(rice);
        storage.add(milk);


        //Iterator to iterate through the collection
        FoodIterator iterator = new FoodIterator(storage.getFood());
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}