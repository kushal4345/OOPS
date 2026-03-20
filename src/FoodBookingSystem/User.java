package FoodBookingSystem;

public class User extends Person {
    public User(String name, String email, String role) {
        super(name, email, role);
    }

    // Login method (ONLY responsibility: login logic)
    public void login() {
        if (!getEmail().contains("@")) {
            System.out.println("Invalid email");
            return;
        }

        System.out.println(getName() + " logged in successfully with email " + getEmail());
    }
    public void Signup() {
        if (!getEmail().contains("@")) {
            System.out.println("Invalid email");
            return;
        }


        System.out.println(getName() + " logged in successfully with email " + getEmail());
    }
}
