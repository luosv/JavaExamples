package javaDirectory;

import java.io.File;

/**
 * 删除目录
 * Created by LuoSw on 2016/10/21 0021.
 */
public class DeleteDir {

    public static boolean deleteDir(File dir) {

        if (dir.isDirectory()) {
            String[] children = dir.list();
            assert children != null;
            for (String i : children) {
                boolean success = deleteDir(new File(dir, i));
                if (!success) {
                    return false;
                }
            }
        }

        if (dir.delete()) {
            System.out.println("successful!");
            return true;
        } else {
            System.out.println("unsuccessful!");
            return false;
        }

    }

}
