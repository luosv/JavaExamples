package javaNetwork;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Socket 实现多线程服务器程序
 * Created by luosv on 2016/10/31 0031.
 */
public class MultiThreadServer implements Runnable {

    Socket socket;

    MultiThreadServer(Socket socket) {
        this.socket = socket;
    }

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Listening");
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Connected");
            new Thread(new MultiThreadServer(socket));
        }

    }

    @Override
    public void run() {

        try {
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            for (int i = 100; i >= 0; i--) {
                printStream.println(i + " bottles of beer on the wall");
            }
            printStream.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
