package java.file;

import java.io.File;

/**
 * 文件路径比较
 * Created by luosv on 2016/10/21 0021.
 */
public class CompareToPath {

    static void compareToPath(String sn, String tn) {

        File fileSn = new File(sn);
        File fileTn = new File(tn);
        System.out.println(fileSn.getPath());
        System.out.println(fileTn.getPath());

        if (fileSn.compareTo(fileTn) == 0) {
            System.out.println("文件路径一致！");
        } else {
            System.out.println("文件路径不一致！");
        }

    }

}
