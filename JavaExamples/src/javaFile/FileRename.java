package javaFile;

import java.io.File;

/**
 * 文件重命名
 * Created by LuoSw on 2016/10/20 0020.
 */
public class FileRename {

    public static void main(String[] args) {

        FileWriting.createFile("123");
        rename("123", "abc");
        DeleteFile.deleteFile("abc");

    }

    static void rename(String sn, String nn) {

        File oldName = new File("E:\\Idea\\JavaExamples\\" + sn);
        File newName = new File("E:\\Idea\\JavaExamples\\" + nn);

        if (oldName.exists() && oldName.isFile()) {
            if (oldName.renameTo(newName)) {
                System.out.println("文件 " + sn + " 已重命名为： " + nn);
            } else {
                System.out.println("Error!");
            }
        } else {
            System.out.println("文件 " + sn + " 不存在!");
        }

    }

}
