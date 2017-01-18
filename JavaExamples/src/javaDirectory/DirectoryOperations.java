package javaDirectory;

import java.io.File;

/**
 * 目录操作
 * Created by luosv on 2016/10/21 0021.
 */
public class DirectoryOperations {

    /**
     * 在指定目录中查找文件
     */
    public static void searchFile(String url) throws Exception {

        File dir = new File(url);
        String[] children = dir.list();
        if (children == null) {
            System.out.println("该目录不存在");
        } else {
            for (String fileName : children) {
                System.out.println(fileName);
            }
        }

    }

    /**
     * 打印目录结构
     */
    public static void showDir(int indent, File file) throws Exception {

        for (int i = 0; i < indent; i++) {
            System.out.print('-');
        }
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            //assert files != null;
            if (files != null) {
                for (File fileName : files) {
                    showDir(indent + 4, fileName);
                }
            }
        }

    }

}
