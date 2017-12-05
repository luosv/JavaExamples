package java.network;

import java.net.InetAddress;
import java.net.Socket;

/**
 * 使用 Socket 连接到指定主机
 * Created by luosv on 2016/10/31 0031.
 */
public class WebPing {

    public static void main(String[] args) {

        try {
            InetAddress address;
            Socket socket = new Socket("www.w3cschool.cn", 80);
            address = socket.getInetAddress();
            System.out.println("连接到： " + address);
            socket.close();
        } catch (java.io.IOException e) {
            System.out.println("无法连接到： " + args[0]);
            System.out.println(e.getMessage());
        }

    }

}
