package javaFile;

import java.io.File;

/**
 * 获取文件大小
 * Created by luosv on 2016/10/20 0020.
 */
public class FileSize {

    public static void main(String[] args) {

        FileWriting.createFile("java.txt", "this is a txt file.");
        getFileSize("java.txt");
        DeleteFile.deleteFile("java.txt");

    }

    private static void getFileSize(String n) {

        File file = new File(n);
        if (file.exists() && file.isFile()) {
            System.out.println("文件 " + n + " 的大小为： " + file.length());
        } else {
            System.out.println("文件 " + n + " 不存在!");
        }

    }

}
