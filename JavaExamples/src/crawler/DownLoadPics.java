package crawler;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.List;

/**
 * 下载图片
 * Created by luosv on 2017/5/5 0005.
 */
public class DownLoadPics {

    public static boolean downLoadPics(List<String> imgUrls, String title, String filePath) throws Exception {
        boolean isSuccess = true;

        // 文件路径+标题
        String dir = filePath + title;
        // 创建
        File fileDir = new File(dir);
        fileDir.mkdirs();

        int i = 1;
        // 循环下载图片
        for (String imgUrl : imgUrls) {
            URL url = new URL(imgUrl);
            // 打开网络输入流
            DataInputStream dis = new DataInputStream(url.openStream());
            int x = (int) (Math.random() * 1000000);
            String newImageName = dir + "/" + x + "pic" + i + ".jpg";
            // 建立一个新的文件
            FileOutputStream fos = new FileOutputStream(new File(newImageName));
            byte[] buffer = new byte[1024];
            int length;
            System.out.println("正在下载......第" + i + "张图片......请稍后");
            // 开始填充数据
            while ((length = dis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            dis.close();
            fos.close();
            System.out.println("第" + i + "张图片下载完毕......");
            i++;
        }

        return isSuccess;
    }

}
