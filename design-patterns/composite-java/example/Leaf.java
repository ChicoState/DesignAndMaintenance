class Leaf implements entertainment
{
    private double price;
    private String name;

    @Override
    public void ListAll() {
        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
    }

    public Leaf(double price, String name) {
        this.price = price;
        this.name = name;
    }

}