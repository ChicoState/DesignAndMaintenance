import java.util.ArrayList;
import java.util.List;

class Composite implements entertainment
{
    private String name;
    List<entertainment> ent = new ArrayList<>();
    Composite(String n)
    {
        name = n;
    }
    public void addElement(entertainment e)
    {
        ent.add(e);
    }

    @Override
    public void ListAll() {
        System.out.println("Component : "+name);
        for(entertainment e : ent)
        {
            e.ListAll();
        }
    }
    
}