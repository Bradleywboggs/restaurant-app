package exercises.restaurant;

import java.time.LocalDateTime;
import java.util.Objects;

public class MenuItem {

    static LocalDateTime now = LocalDateTime.now();
    static LocalDateTime thirtyDays = now.minusDays(30);

    enum MenuCategory {

        APPETIZER, MAIN_COURSE, DESSERT
    }

    private String itemName;
    private String itemDescription;
    private final MenuCategory itemCategory;
    private double itemPrice;
    private Boolean isNewItem;
    private final LocalDateTime itemTimeStamp;


    public MenuItem(String itemName, String itemDescription, MenuCategory itemCategory, double itemPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        if (itemPrice <= 0) {
            throw new IllegalArgumentException("Price must be above 0");
        } else {
            this.itemPrice = itemPrice;
        }
            this.itemTimeStamp = LocalDateTime.now();
            this.isNewItem = true;


    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public MenuCategory getItemCategory() {
        return itemCategory;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        if (itemPrice <= 0) {
            throw new IllegalArgumentException("Price must be above 0");
        } else {
            this.itemPrice = itemPrice;
        }
    }

    public Boolean getIsNewItem() {
        return isNewItem;
    }

    public void setIsNewItem() {
        if (this.itemTimeStamp.equals(thirtyDays) || this.itemTimeStamp.isAfter(thirtyDays)) {
            this.isNewItem = true;
        } else {
            this.isNewItem = false;
        }

    }

    public LocalDateTime getItemTimeStamp() {
        return itemTimeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(itemName, menuItem.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName);
    }






    }

