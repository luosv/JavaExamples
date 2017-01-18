package javaNetwork;

import java.net.URL;
import java.net.URLConnection;

/**
 * 获取远程文件大小
 * Created by luosv on 2016/10/31 0031.
 */
public class GetTelnetFile {

    public static void main(String[] args) throws Exception {

        int size;
        URL url = new URL("http://www.w3cschool.cn/wp-content/themes/w3cschool.cn/assets/img/newlogo.png");
        URLConnection conn = url.openConnection();
        size = conn.getContentLength();
        if (size < 0) {
            System.out.println("无法获取文件大小");
        } else {
            System.out.println("文件大小为： " + size + "bytes");
        }
        conn.getInputStream().close();

    }

}
