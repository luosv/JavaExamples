package java.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 获取指定主机的IP地址
 * Created by luosv on 2016/10/31 0031.
 */
public class GetAddress {

    public static void main(String[] args) {

        InetAddress address = null;

        try {
            address = InetAddress.getByName("www.w3cschool.cn");
        } catch (UnknownHostException e) {
            System.exit(2);
        }

        System.out.println(address.getHostName() + " = " + address.getHostAddress());
        System.exit(0);

    }

}
