public class MenuItem {
    private String menuItem;
    private float price;
    private String description;

    public MenuItem(String menuItem, float price, String description) {
        this.menuItem = menuItem;
        this.price = price;
        this.description = description;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  menuItem + " "+ price + " "+ description;
    }
}
