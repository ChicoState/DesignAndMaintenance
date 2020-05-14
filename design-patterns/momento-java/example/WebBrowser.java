import java.time.LocalDate;
//Client
public class WebBrowser{
    public static void main(String args[])
    {
        //IN THIS CYCLE WE WILL CREATE 2 TABS AND REMOVE THE LATEST TAB
        History history = new History().getInstance();

        //Starts the Browser
        Browser browser = new Browser();

        //Create a new tab in browser, website = www.google.com and date
        CurrentTab tab1 = new CurrentTab("www.google.com", LocalDate.of(2019,1,1));
        browser.create_tab(tab1);

        CurrentTab tab2 = new CurrentTab("www.chico.com", LocalDate.of(2019,3,1));
        browser.create_tab(tab2);

        //Display Complete Browser History
        browser.disp_history();

        //Remove the latest Tab opened from history
        history.move_to_previous_state();
        browser.disp_history();

        //IN THIS CYCLE WE WILL RESTORE THE DELETED TAB
        //This will restore the last deleted tab ie www.chico.com
        history.restore_previous_delete();
        //display latest browser history
        browser.disp_history();
    }
}