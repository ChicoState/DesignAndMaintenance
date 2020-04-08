public class main{
    public static void main(String[] args)
    {
        Leaf m1 = new Leaf(10,"Movie_1");
        Leaf m2 = new Leaf(20,"Movie_2");

        Leaf s1 = new Leaf(11,"Series_1");
        Leaf s2 = new Leaf(21,"Series_2");

        Composite mm = new Composite("Movies");
        mm.addElement(m1);
        mm.addElement(m2);

        Composite ss = new Composite("Series");
        ss.addElement(s1);
        ss.addElement(s2);

        //Lists only 1 Series
        s1.ListAll();
        System.out.println("\n\n");
        //Lists all the Series
        ss.ListAll();
    }
}