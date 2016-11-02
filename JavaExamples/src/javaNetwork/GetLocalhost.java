package javaNetwork;

import java.net.InetAddress;

/**
 * 获取本机ip地址及主机名
 * Created by LuoSw on 2016/10/31 0031.
 */
public class GetLocalhost {

    public static void main(String[] args) throws Exception {

        InetAddress address = InetAddress.getLocalHost();
        System.out.println("Localhost Address: " + address.getHostAddress());
        System.out.println("Localhost Name: " + address.getHostName());

    }

}
