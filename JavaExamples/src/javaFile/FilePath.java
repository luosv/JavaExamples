package javaFile;

import java.io.File;
import java.io.IOException;

/**
 * 在指定目录中创建文件
 * Created by LuoSw on 2016/10/20 0020.
 */
public class FilePath {

    public static void main(String[] args) {

        try {

            File dir = new File("E:\\Idea\\JavaExamples\\");
            File file = File.createTempFile("JavaTemp", ".javaTemp", dir);
            System.out.println(file.getPath());

        } catch (IOException e) {

            e.printStackTrace();

        }

        DeleteFile.deleteFileByEndsWith("javaTemp");

    }

    static void createFilePath(String url, String n) {

        try {

            File file = new File(url + n);
            if (!file.exists() || !file.isFile()) {
                if (file.createNewFile()) {
                    System.out.println("文件 " + n + " 创建成功!");
                } else {
                    System.out.println("Error!");
                }
            } else {
                System.out.println("文件 " + n + " 已存在!");
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
