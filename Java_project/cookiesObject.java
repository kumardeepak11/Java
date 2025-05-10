import java.util.HashMap;
import java.util.Map;


public class Cookies {
    private Map<String, String> cookieStore;

    // Constructor to initialize the cookie store
    public Cookies() {
        cookieStore = new HashMap<>();
    }

    // Method to add a cookie
    public void addCookie(String name, String value) {
        cookieStore.put(name, value);
        System.out.println("Cookie added: " + name + " = " + value);
    }

    // Method to get a cookie value by its name
    public String getCookie(String name) {
        return cookieStore.getOrDefault(name, "Cookie not found");
    }

    // Method to delete a cookie by its name
    public void deleteCookie(String name) {
        if (cookieStore.containsKey(name)) {
            cookieStore.remove(name);
            System.out.println("Cookie deleted: " + name);
        } else {
            System.out.println("Cookie not found: " + name);
        }
    }

    // Method to display all cookies
    public void displayCookies() {
        if (cookieStore.isEmpty()) {
            System.out.println("No cookies stored.");
        } else {
            System.out.println("Stored cookies:");
            for (Map.Entry<String, String> entry : cookieStore.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Cookies cookies = new Cookies();

        // Adding cookies
        cookies.addCookie("SessionID", "abc123");
        cookies.addCookie("UserID", "user42");

        // Displaying all cookies
        cookies.displayCookies();

        // Retrieving a specific cookie
        System.out.println("Retrieved cookie: " + cookies.getCookie("SessionID"));

        // Deleting a cookie
        cookies.deleteCookie("UserID");

        // Displaying all cookies after deletion
        cookies.displayCookies();
    }
}