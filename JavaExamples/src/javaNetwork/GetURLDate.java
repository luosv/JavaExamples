package javaNetwork;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

/**
 * 获取 URL响应头的日期信息
 * Created by lv on 2016/11/7 0007.
 */
public class GetURLDate {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://www.w3cschool.cn");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        long date = httpURLConnection.getDate();
        if (date == 0) {
            System.out.println("无法获取信息");
        } else {
            System.out.println("Date: " + new Date(date));
        }

    }

}
