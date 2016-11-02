package javaDirectory;

import java.io.File;

/**
 * 递归创建目录
 * Created by LuoSw on 2016/10/21 0021.
 */
public class Mkdir {

    public static void mkdir(String url) {

        File file = new File(url);
        boolean result = file.mkdirs();
        if (result) {
            System.out.println(url + " successful!");
        } else {
            System.out.println(url + " unsuccessful!");
        }

    }

}
