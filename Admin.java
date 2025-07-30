import java.time.LocalDate;

public class Admin extends User {

    public Admin(String name, LocalDate dob) {
        super(name, dob);
    }

    @Override
    public void displayHappyBirthday() {
        if (isBirthday()) {
            int currentYear = LocalDate.now().getYear();
            int age = currentYear - dob.getYear();
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }
}
