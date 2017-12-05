package java.file;

import java.io.*;

/**
 * 向文件中追加数据
 * Created by luosv on 2016/10/19 0019.
 */
public class AddData {

    public static void main(String[] args) throws Exception {

        try {

            BufferedWriter out = new BufferedWriter(new FileWriter("fileName"));
            out.write("aString\n");
            out.close();

            out = new BufferedWriter(new FileWriter("fileName", true));
            out.write("bString");
            out.close();

            BufferedReader in = new BufferedReader(new FileReader("fileName"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();

            FileWriting.createFile("file");
            CopyContent.copyContent("fileName", "file");
            FileReading.readFile("file");

        } catch (IOException e) {

            e.printStackTrace();

        }

        DeleteFile.deleteFile("fileName");
        DeleteFile.deleteFile("file");

    }

    static void addData(String n, String s) {

        try {

            File file = new File(n);

            if (file.exists() && file.isFile()) {
                BufferedWriter out = new BufferedWriter(new FileWriter(n, true));
                out.write(s + "\n");
                out.close();
                System.out.println("成功向文件 " + n + " 添加数据： " + s);
            } else {
                System.out.println("文件 " + n + " 不存在!");
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
