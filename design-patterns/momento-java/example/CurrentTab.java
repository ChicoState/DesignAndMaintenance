import java.time.LocalDate;

// Momento
public class CurrentTab {
    private String website;
    private LocalDate date;
    History history = new History().getInstance();

    public CurrentTab(String s, LocalDate d)
    {
        System.out.println("\nOpening Tab: "+s);
        website = s;
        date = d;
        history.add_tab(this);
    }
    public String getInfo()
    {
        String s = "Date: " + date.toString();
        s = s + " Website: "+website;
        return s;
    }
    public void setInfo(String s, LocalDate d)
    {
        website = s;
        date = d;
    }
    public String getWebsite()
    {
        return website;
    }
    public LocalDate getDate()
    {
        return date;
    }
}