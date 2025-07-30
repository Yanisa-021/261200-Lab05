import java.time.LocalDate;

public class Lab05 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        User gip = new User("gip", today);
        Admin yanisa = new Admin("yanisa", LocalDate.of(2005, 1, 1));

        gip.displayHappyBirthday();
        yanisa.displayHappyBirthday(); // ไม่แสดง
    }
}
