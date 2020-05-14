import java.util.ArrayList;

//Caretaker
public class History{
    private ArrayList<CurrentTab> history = new ArrayList<>();
    private int current_state = -1;
    private CurrentTab lastDeleted;
    private static History single_instance = null; 

        public static History getInstance() 
        { 
            if (single_instance == null) 
                single_instance = new History(); 
      
            return single_instance; 
        } 
    

    public void add_tab(CurrentTab c)
    {
        history.add(c);
        current_state = history.size() - 1;
    }

    public CurrentTab get_tab(int i)
    {
        return history.get(i);
    }

    //Removes the latest TAB information
    public CurrentTab move_to_previous_state()
    {
        if(current_state>0)
        {
            System.out.println("\nLatest Website  is: " + history.get(current_state).getInfo());
            System.out.println("Removing: "+history.get(current_state).getInfo());
            lastDeleted = history.get(current_state);
            history.remove(current_state);
            current_state = current_state - 1;
            System.out.println("Successfully removed latest website from history!");
        }
        else
        {
            System.out.println("No Previous State");
        }
        return get_tab(current_state);
    }

    public CurrentTab get_latest_tab()
    {
        return get_tab(current_state);
    }

    public void restore_previous_delete()
    {
        if(lastDeleted.getWebsite()!=null)
        {
            System.out.println("\nRestoring: "+ history.get(current_state).getInfo());
            history.add(lastDeleted);
            current_state = current_state + 1;
            System.out.println("Restored: "+history.get(current_state).getInfo()+" Successfully!");
        }
        else
        {
            System.out.println("Nothing to delete");
        }

    }

    public void print_history()
    {
        for(CurrentTab item : history)
        {   
            System.out.println(item.getInfo());
        }
    }

}