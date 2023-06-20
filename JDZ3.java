import java.time.LocalTime;
import java.util.Scanner;

public class JDZ3 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = scan.nextLine();
            String welcome = "";
            LocalTime currentTime = LocalTime.now();
            if(currentTime.isAfter(LocalTime.parse("23:59:59.99999999"))){
                welcome = "Доброй ночи, " + name;
            } else if(currentTime.isAfter(LocalTime.parse("18:00:00.000000000"))){
                welcome = "Добрый вечер, " + name;
            } else if(currentTime.isAfter(LocalTime.parse("12:00:00.000000000"))){
                welcome = "Добрый день, " + name;
            } else if(currentTime.isAfter(LocalTime.parse("05:00:00.000000000"))){
                welcome = "Доброе утро, " + name;
            }
            System.out.println(welcome);
        
    }
}
  

