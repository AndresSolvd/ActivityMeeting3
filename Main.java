import java.time.LocalTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        //1. Write a Java program to get the character at the given index within the String.
        short index = 0;
        String str = "program";
        System.out.println("The character at index " + index + " is " + str.charAt(index));

        //2. Print current time in New York.
        LocalTime timeInNewYork = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println("Time in New York is " + timeInNewYork);
//        Calendar
//        TimeZone.getTimeZone(...)


        //3. Compute the sum of the digits in an integer.
        int num = 210;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("The sum of digits is " + sum);
        System.out.println();


        // Task4 : for Restaurant system
        MenuItem menuItem1 = new MenuItem("Red curry", 13.5f, "curry blend with cocunut and spicies");
        MenuItem menuItem2 = new MenuItem("Green curry", 14.5f, "curry blend with cocunut and spicies and green chillies");
        MenuItem menuItem3 = new MenuItem("Pasta Alla Bolognese", 17.4f, "Tomato basil sauce with meatballs");

        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem(menuItem1);
        restaurant.addMenuItem(menuItem2);
        restaurant.addMenuItem(menuItem3);


        Review review1 = new Review((byte) 4, "abc", "the food is great");
        Review review2 = new Review((byte) 1, "xyz", "too spicy");
        Review review3 = new Review((byte) 5, "ddd", "mama mia");
        restaurant.addReview(review1);
        restaurant.addReview(review2);
        restaurant.addReview(review3);

        restaurant.printMenu();

        System.out.println("\nThe restaurant's average rating is " + restaurant.getAvgRating());

    }
}