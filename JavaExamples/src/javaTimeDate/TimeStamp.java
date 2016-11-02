package javaTimeDate;

import java.time.Instant;
import java.util.Date;

/**
 * 时间戳
 * Created by LuoSw on 2016/10/17 0017.
 */
public class TimeStamp {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());

        Instant timeStamp = Instant.now();
        System.out.println(timeStamp);

        Date date = Date.from(Instant.now());
        System.out.println(date);

    }

}
