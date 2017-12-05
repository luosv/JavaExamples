package java.network;

import java.net.URL;

/**
 * 解析 URL
 * Created by luosv on 2016/11/7 0007.
 */
public class AnalysisURL {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://www.w3cschool.cn/html/html-tutorial.html");
        System.out.println("URL: " + url.toString());
        System.out.println("协议: " + url.getProtocol());
        System.out.println("文件名: " + url.getFile());
        System.out.println("主机名: " + url.getHost());
        System.out.println("端口号: " + url.getPort());
        System.out.println("默认端口号: " + url.getDefaultPort());
        System.out.println("路径: " + url.getPath());

    }

}
