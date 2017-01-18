package javaFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 读取文件内容
 * Created by luosv on 2016/10/19 0019.
 */
public class FileReading {

    public static void main(String[] args) {

        try {

            BufferedReader in = new BufferedReader(new FileReader("love"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close(); // 关闭流

        } catch (IOException e) {

            e.printStackTrace();

        }

        readFile("newFile");

        DeleteFile.deleteFile("love");
        DeleteFile.deleteFile("newFile");

    }

    static void readFile(String n) {

        try {

            File file = new File(n);

            if (file.exists() && file.isFile()) {
                BufferedReader in = new BufferedReader(new FileReader(n));
                String str;
                System.out.println("文件 " + n + " 的内容：");
                while ((str = in.readLine()) != null) {
                    System.out.println(str);
                }
                in.close(); // 读取文件也需关闭流，否则后续代码无法操作文件
            } else {
                System.out.println("文件 " + n + " 不存在!");
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
