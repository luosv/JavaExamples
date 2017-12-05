package java.time.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 格式化时间
 * Created by luosv on 2016/10/17 0017.
 */
public class SimpleDateFormat {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yy")));

        LocalTime time = LocalTime.now();
        System.out.println(time.format(DateTimeFormatter.ofPattern("mm:ss:HH")));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-ss HH:mm:ss")));

    }

}
