package java.network;

import java.net.URL;
import java.net.URLConnection;

/**
 * 查看主机指定文件的最后修改时间
 * Created by luosv on 2016/10/31 0031.
 */
public class GetLastModified {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://127.0.0.1/java.bmp");
        URLConnection urlConnection = url.openConnection();
        urlConnection.setUseCaches(false);
        long timeTamp = urlConnection.getLastModified();
        System.out.println(timeTamp);

    }

}
