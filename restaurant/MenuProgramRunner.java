package exercises.restaurant;

import java.util.ArrayList;

import static exercises.restaurant.MenuItem.MenuCategory.APPETIZER;
import static exercises.restaurant.MenuItem.MenuCategory.DESSERT;
import static exercises.restaurant.MenuItem.MenuCategory.MAIN_COURSE;

public class MenuProgramRunner {


    public static void main(String[] args) {


        ArrayList<MenuItem> menuItems = new ArrayList<>();

        MenuItem eggSandwich = new MenuItem("Egg Sandwich", "", MAIN_COURSE, 0.0);
        MenuItem tiramisu = new MenuItem("Tiramisu", "", DESSERT, 0.0);

        menuItems.add(eggSandwich);
        menuItems.add(tiramisu);

        Menu gileadsPlaceMenu = new Menu(menuItems);

        System.out.println(eggSandwich.getItemTimeStamp());
        System.out.println(tiramisu.getItemTimeStamp());

        for (MenuItem item : gileadsPlaceMenu.getMenuItems()) {
            item.setIsNewItem();
        }


        gileadsPlaceMenu.setLastUpdated();
        System.out.println("Lastupdate1: " + gileadsPlaceMenu.getLastUpdated());

        MenuItem onionRings = new MenuItem("Onion Rings", "", APPETIZER, 0.0);
        gileadsPlaceMenu.getMenuItems().add(onionRings);
        System.out.println(onionRings.getItemTimeStamp());

        System.out.println("Lastupdate 2: <expect no change>" + gileadsPlaceMenu.getLastUpdated());
        gileadsPlaceMenu.setLastUpdated();
        System.out.println("Lastupdate 3: <expect more recent time>" + gileadsPlaceMenu.getLastUpdated());

        System.out.println(onionRings.getItemTimeStamp().isBefore(eggSandwich.getItemTimeStamp()));

    }






    }

