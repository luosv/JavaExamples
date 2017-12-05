package java.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 查看端口是否已使用
 * Created by luosv on 2016/10/31 0031.
 */
public class CheckPort {

    public static void main(String[] args) {

        Socket socket;
        String host = "localhost";
        if (args.length > 0) {
            host = args[0];
        }
        for (int i = 0; i < 1024; i++) {
            try {
                System.out.println("查看 " + i);
                socket = new Socket(host, i);
                System.out.println("端口 " + i + " 已被使用");
            } catch (UnknownHostException e) {
                System.out.println("Exception occured" + e);
                break;
            } catch (IOException e) {}
        }

    }

}
