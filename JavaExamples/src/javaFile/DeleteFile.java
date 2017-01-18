package javaFile;

import java.io.File;

/**
 * 删除文件
 * Created by luosv on 2016/10/19 0019.
 */
public class DeleteFile {

    public static void main(String[] args) {

        // FileWriting fileWriting = new FileWriting(); // 静态方法不需要使用对象调用，直接类名.方法名调用
        FileWriting.createFile("test", "this is a test file");
        FileReading.readFile("test");

        try {

            File file = new File("E:\\Idea\\JavaExamples\\test");
            if (file.delete()) {
                System.out.println(file.getName() + " 文件删除成功!");
            } else {
                System.out.println("文件删除失败!");
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public static void deleteFile(String n) {

        try {

            File file = new File("E:\\Idea\\JavaExamples\\" + n);

            if (file.exists() && file.isFile()) {
                if (file.delete()) {
                    System.out.println("文件 " + n + " 删除成功!");
                } else {
                    System.out.println("文件 " + n + " 删除失败!");
                }
            } else {
                System.out.println("文件 " + n + " 不存在!");
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public static void deleteFileByEndsWith(String s) {

        try {

            File file = new File("E:\\Idea\\JavaExamples\\");
            File temp;
            File[] files = file.listFiles();
            assert files != null;
            for (File i : files) {
                temp = i;
                if (temp.getName().endsWith(s)) {
                    boolean bl = temp.delete();
                    if (bl) {
                        System.out.println("删除: " + temp.getName());
                    } else {
                        System.out.println("Error!");
                    }
                }
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
