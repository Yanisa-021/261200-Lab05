import java.time.LocalDate;

public class Lab05 {
    public static void main(String[] args) {
        // เปลี่ยนวันเกิดให้ตรงกับวันนี้เพื่อทดสอบ
        LocalDate today = LocalDate.now();

        User john = new User("John", today);
        Admin nicolas = new Admin("Nicolas", LocalDate.of(1964, today.getMonth(), today.getDayOfMonth()));

        john.displayHappyBirthday();     // จะพิมพ์ Happy birthday John!
        nicolas.displayHappyBirthday();  // จะพิมพ์ Happy birthday Nicolas! You are 60! (ถ้าปีปัจจุบันคือ 2024)
    }
}
