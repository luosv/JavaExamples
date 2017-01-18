package javaTimeDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 获取当前时间
 * Created by luosv on 2016/10/17 0017.
 */
public class NowTimeDate {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

    }

}
