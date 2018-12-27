package exercises.restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Menu {

    private final ArrayList<MenuItem> menuItems;
    private LocalDateTime lastUpdated;


    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.lastUpdated = MenuItem.now;

    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public LocalDateTime getLastUpdated() {
        return this.lastUpdated;
    }


     public void setLastUpdated() {
        this.lastUpdated = updateLastUpdated();
    }



    private LocalDateTime updateLastUpdated() {
        LocalDateTime mostRecentUpdate = LocalDateTime.parse("1900-01-01T00:00:00");
        for (int i = 0; i < this.menuItems.size(); i++) {
            if (this.menuItems.get(i).getItemTimeStamp().isAfter(mostRecentUpdate)) {
                mostRecentUpdate = this.menuItems.get(i).getItemTimeStamp();

            }

        } return mostRecentUpdate;

    }
}












