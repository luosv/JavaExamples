package java.network.ServerSocket;

import java.io.*;
import java.net.Socket;

/**
 * ServerSocket 和 Socket 通信实例
 * Created by luosv on 2016/11/7 0007.
 * <p>
 * 2、建立客户端
 * <p>
 * 创建 Socket 通信，设置通信服务器的 IP 和 Port
 * 建立 IO 输出流向服务器发送数据消息
 * 建立 IO 输入流读取服务器发送来的数据消息
 * 客户端代码:
 */
public class Client {

    public static void main(String[] args) {

        try {

            Socket s = new Socket("127.0.0.1", 8888);

            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));

            //向服务器发送一条消息
            bw.write("测试客户端和服务器通信，服务器收到消息返回到客户端\n");
            bw.flush();

            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
            System.out.println("服务器: " + mess);

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
