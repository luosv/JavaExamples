package javaFile;

import java.io.File;

/**
 * 设置文件只读
 * Created by luosv on 2016/10/20 0020.
 */
public class FileSetReadOnly {

    public static void main(String[] args) {

        FileWriting.createFile("abc.txt");
        setReadOnly("abc.txt");
        setReadAndWrite("abc.txt");
        DeleteFile.deleteFile("abc.txt");

    }

    static void setReadOnly(String n) {

        File file = new File(n);
        boolean bl = file.setReadOnly();

        if (bl) {
            System.out.println("文件 " + n + " 已设置为只读!");
        } else {
            System.out.println("Error!");
        }

    }

    static void setReadAndWrite(String n) {

        File file = new File(n);
        boolean bl = file.setWritable(true);

        if (bl) {
            System.out.println("文件 " + n + " 已设置为读写!");
        } else {
            System.out.println("Error!");
        }

    }

}
