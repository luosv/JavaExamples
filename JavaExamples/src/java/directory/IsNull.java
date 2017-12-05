package java.directory;

import java.io.File;

/**
 * 判断目录是否为空
 * Created by luosv on 2016/10/21 0021.
 */
public class IsNull {

    public static void isNull(String url) {

        File file = new File(url);
        if (file.isDirectory()) {
            String[] files = file.list();
            //assert files != null;
            if (files != null && files.length > 0) {
                System.out.println("目录 " + file.getPath() + " 不为空！");
            }
        }

    }

}
