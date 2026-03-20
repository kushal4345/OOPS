package FoodBookingSystem;

public class Person {
    private String name;
    private String email;
    private String role;

    // Constructor (best way to set data)
    public Person(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Getters (controlled access)
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
}
