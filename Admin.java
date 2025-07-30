import java.time.LocalDate;

public class Admin extends User {
    public Admin() {
        super();
    }
    // sets name and date of birth
    public Admin(String name, LocalDate dob) {
        super(name, dob);
    }
    @Override
    public void displayHappyBirthday() {
        if (isBirthday()) {
            // Calculate age by subtracting birth year from current year
            int age = LocalDate.now().getYear() - dob.getYear();
            System.out.println("Happy birthday " + name + "! You are " + age + "!");
        }
    }
}
