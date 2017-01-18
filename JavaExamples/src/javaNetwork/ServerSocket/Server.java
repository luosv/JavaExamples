package javaNetwork.ServerSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ServerSocket 和 Socket 通信实例
 * Created by luosv on 2016/11/7 0007.
 * <p>
 * 1、建立服务器端
 * <p>
 * 服务器建立通信 ServerSocket
 * 服务器建立 Socket 接收客户端连接
 * 建立 IO 输入流读取客户端发送的数据
 * 建立 IO 输出流向客户端发送数据消息
 * 服务器端代码:
 */
public class Server {

    public static void main(String[] args) {

        try {

            ServerSocket ss = new ServerSocket(8888);
            System.out.println("启动服务器...");
            Socket s = ss.accept();
            System.out.println("客户端: " + s.getInetAddress().getHostName() + " 已连接到服务器");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            // 读取客户端发送来的消息
            String mess = br.readLine();
            System.out.println("客户端: " + mess);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write(mess + "\n");
            bw.flush();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
