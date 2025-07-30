import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;
    public User() {

        this.name = "";
        this.dob = LocalDate.now();
    }

    public User(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }
    public boolean isBirthday() {
        LocalDate today = LocalDate.now(); // Get today date
        // Return true if month and day match user's dob
        if (today.getMonthValue() == dob.getMonthValue() && today.getDayOfMonth() == dob.getDayOfMonth()) {
            return true;
        }
        return false;
    }
    public void displayHappyBirthday() {
        if (isBirthday()) {
            System.out.println("Happy birthday " + name + "!");
        }
    }
}
