import java.time.LocalDate;
import java.time.Month;

public class User {
    protected String name;
    protected LocalDate dob;

    public User(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonth() == dob.getMonth() && today.getDayOfMonth() == dob.getDayOfMonth();
    }

    public void displayHappyBirthday() {
        if (isBirthday()) {
            System.out.println("Happy birthday " + this.name + "!");
        }
    }
}
