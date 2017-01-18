package javaFile;

import java.io.File;
import java.io.IOException;

/**
 * 创建文件
 * Created by luosv on 2016/10/20 0020.
 */
public class CreateFile {

    public static void main(String[] args) {

        createFile("abc");
        DeleteFile.deleteFile("abc");

    }

    public static void createFile(String n) {

        try {

            File file = new File("E:\\Idea\\JavaExamples\\" + n);
            if (!file.exists() || !file.isFile()) {
                if (file.createNewFile()) {
                    System.out.println("文件 " + n + " 创建成功!");
                } else {
                    System.out.println("文件 " + n + " 创建失败!");
                }
            } else {
                System.out.println("文件 " + n + " 已存在!");
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
