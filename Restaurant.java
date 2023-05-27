import java.util.ArrayList;

public class Restaurant {
    //Arraylist of menuitems and reviews
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private ArrayList<Review> reviews = new ArrayList<>();

    //methods to add and remove items, print all items, add reviews and count average rating
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    public void printMenu() {
        // need to format the output

        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem);
        }
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public int getAvgRating() {
        int sum = 0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        return (reviews.size());
    }
}
