package javaFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * 创建临时文件
 * Created by luosv on 2016/10/19 0019.
 */
public class TempFile {

    public static void main(String[] args) throws Exception {

        File temp = File.createTempFile("pattern", ".suffix");
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter("temp"));
        out.write("aString");
        System.out.println("临时文件 temp 创建成功!");
        out.close();

        FileReading.readFile("temp");
        DeleteFile.deleteFile("temp");

    }

    static void createTempFile(String n) {

        try {

            File temp = File.createTempFile("pattern", ".suffix");
            temp.deleteOnExit();
            BufferedWriter out = new BufferedWriter(new FileWriter(n));
            System.out.println("临时文件 " + n + " 创建成功!");
            out.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    static void createTempFile(String n, String s) {

        try {

            File temp = File.createTempFile("pattern", ".suffix");
            temp.deleteOnExit();
            BufferedWriter out = new BufferedWriter(new FileWriter(n));
            out.write(s);
            System.out.println("临时文件 " + n + " 创建成功!");
            out.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
