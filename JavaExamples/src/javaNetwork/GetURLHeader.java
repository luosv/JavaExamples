package javaNetwork;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

/**
 * 获取 URL 响应头信息
 * Created by luosv on 2016/11/7 0007.
 */
public class GetURLHeader {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://www.w3cschool.cn");
        URLConnection urlConnection = url.openConnection();

        Map headers = urlConnection.getHeaderFields();
        Set<String> keys = headers.keySet();
        for (String key : keys) {
            String value = urlConnection.getHeaderField(key);
            System.out.println(key + "  " + value);
        }
        System.out.println(urlConnection.getLastModified());

    }

}
