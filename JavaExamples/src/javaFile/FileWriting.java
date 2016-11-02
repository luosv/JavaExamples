package javaFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件写入
 * Created by LuoSw on 2016/10/19 0019.
 */
public class FileWriting {

    public static void main(String[] args) {

        try {

            BufferedWriter out = new BufferedWriter(new FileWriter("love"));
            out.write("I LOVE YOU");
            out.close(); // 关闭流
            System.out.println("文件创建成功");

        } catch (IOException e) {

            e.printStackTrace();

        }

        createFile("newFile", "This is new file. create by used method.");

    }

    static void createFile(String n) {

        try {

            File file = new File(n);

            if (!file.exists() || !file.isFile()) {
                BufferedWriter out = new BufferedWriter(new FileWriter(n));
                out.close();
                System.out.println("文件 " + n + " 创建成功!");
            } else {
                System.out.println("文件 " + n + " 已存在!");
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    static void createFile(String n, String s) {

        try {

            File file = new File(n);

            if (!file.exists() || !file.isFile()) {
                BufferedWriter out = new BufferedWriter(new FileWriter(n));
                out.write(s + "\n");
                out.close();
                System.out.println("文件 " + n + " 创建成功!");
            } else {
                System.out.println("文件 " + n + " 已存在!");
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
