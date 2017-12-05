package java.file;

import java.io.File;

/**
 * 检测文件是否存在
 * Created by luosv on 2016/10/20 0020.
 */
public class FileExists {

    public static void main(String[] args) {

        isExists("123");

    }

    static void isExists(String n) {

        File file = new File(n);
        boolean bl = file.exists();

        if (bl) {
            System.out.println("文件 " + n + " 存在!");
        } else {
            System.out.println("文件 " + n + " 不存在!");
        }

    }

}
