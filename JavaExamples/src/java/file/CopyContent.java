package java.file;

import java.io.*;

/**
 * 将文件内容复制到另一个文件
 * Created by luosv on 2016/10/19 0019.
 */
public class CopyContent {

    public static void main(String[] args) throws Exception {

        //FileWriting.createFile("srcFile", "string to be copied\n");
        FileWriting.createFile("srcFile");
        AddData.addData("srcFile", "string to be copied");

        InputStream in = new FileInputStream(new File("srcFile"));
        OutputStream out = new FileOutputStream(new File("desFile"));
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();

        FileReading.readFile("srcFile");
        FileReading.readFile("desFile");

        DeleteFile.deleteFile("srcFile");
        DeleteFile.deleteFile("desFile");

    }

    static void copyContent(String sn, String tn) {

        try {

            File sFile = new File(sn);
            if (sFile.exists() && sFile.isFile()) {
                InputStream in = new FileInputStream(new File(sn));
                File tFile = new File(tn);
                if (tFile.exists() && sFile.isFile()) {
                    OutputStream out = new FileOutputStream(new File(tn));
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }
                    in.close();
                    out.close();
                } else {
                    System.out.println("目标文件 " + tn + " 不存在!");
                }
            } else {
                System.out.println("源文件 " + sn + " 不存在!");
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
