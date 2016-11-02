package javaNetwork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * 网页抓取
 * Created by LuoSw on 2016/10/31 0031.
 */
public class WebPageCrawling {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://www.w3cschool.cn");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data.html"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();

    }

}
