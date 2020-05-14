import java.time.LocalDate;

//Originator
public class Browser{
    private String url;
    private LocalDate visited;

    public Browser()
    {
        System.out.println("Browser Chico Started");
    }
    public Browser(CurrentTab c)
    {
        url = c.getWebsite();
        visited = c.getDate();
    }
    public String getBrowserDetails()
    {
        String s;
        if(url==null)
            s = "No Details to show.";
        else
        {
            s = "Current URL: " + url;
            s = s + "(" + visited.toString() + ")";
        }
        return s;
    }
    public void setDetails(String s, LocalDate d)
    {
        url = s;
        visited = d;
    }
    public CurrentTab save()
    {
        return new CurrentTab(url, visited);
    }
    public void restore(CurrentTab curr)
    {
        url = curr.getWebsite();
        visited = curr.getDate();
    }
    public void create_tab(CurrentTab c)
    {
        url = c.getWebsite();
        visited = c.getDate();
    }
    public void disp_history()
    {
        History hist = new History().getInstance();
        System.out.println("\nBrowser History: ");
        hist.print_history();
    }
}

