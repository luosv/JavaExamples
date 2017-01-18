package javaFile;

import java.io.File;
import java.util.Date;

/**
 * 修改文件最后的修改日期
 * Created by luosv on 2016/10/19 0019.
 */
public class ChangeLastModified {

    public static void main(String[] args) {

        try {

            File fileToChange = new File("E:\\Idea\\JavaExamples\\myJavaFileToChange.txt");
            boolean bl = fileToChange.createNewFile();

            if (bl) {
                Date fileTime = new Date(fileToChange.lastModified());
                System.out.println(fileTime.toString());

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
                fileTime = new Date(fileToChange.lastModified());
                System.out.println(fileTime.toString());
            } else {
                System.out.println("Error!");
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        DeleteFile.deleteFile("myJavaFileToChange.txt");

    }

    /**
     * 获取文件最后的修改时间
     */
    static void getLastModified(String n) {

        File file = new File(n);
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);

    }

}
