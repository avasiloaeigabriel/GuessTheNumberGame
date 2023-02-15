import java.time.LocalDateTime;
public class TestingImporters {
    public static void main(String[] args) {
       LocalDateTime localDate=LocalDateTime.now();
        System.out.println(localDate.getHour()+":"+ localDate.getMinute()+":"+ localDate.getSecond());
    }
}
