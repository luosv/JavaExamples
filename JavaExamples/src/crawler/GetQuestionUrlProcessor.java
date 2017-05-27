package crawler;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.JsonPathSelector;

import java.util.List;

/**
 * 爬虫大法╰(￣▽￣)╭
 * Created by luosv on 2017/5/5 0005.
 */
public class GetQuestionUrlProcessor implements PageProcessor {

    // 设置编码，超时时间，重试次数
    private Site site = Site.me().setRetryTimes(10).setSleepTime(5000).setTimeOut(5000)
            .addCookie("", "")
            .addCookie("", "")
            .setUserAgent("");
    // 问题的索引
    //
    private static final String URL_QUESTION = "";
    //
    private static final String URL_ANSWER = "";

    private static String questionId = "";

    @Override
    public void process(Page page) {
        // 页面为问题页，则将答案链接循环加入到Downloader
        if (page.getUrl().regex(URL_QUESTION).match()) {
            int total = 20;
            int time = total / 20;
            for (int i = 0; i < time; i++) {
                int offset = i * 20;
                int limit = total < (i + 1) * 20 ? total : ((i + 1) * 20 - 1);
                String url = "" + questionId + "";
                page.addTargetRequest(url);
            }
            // 某个具体答案详情页面，则获取详细信息
        } else if (page.getUrl().regex(URL_ANSWER).match()) {
            String questionTitle = page.getHtml().xpath("").toString();
            System.out.println("题目：" + questionTitle);
            List<String> urlList = page.getHtml().xpath("").all();
            System.out.println("图片地址：" + urlList);
            String filePath = "" + questionTitle;
            String title = "";
            try {
                DownLoadPics.downLoadPics(urlList, title, filePath);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            List<String> id = new JsonPathSelector("$.data[*].id").selectList(page.getRawText());
            for (int i = 0; i < id.size(); i++) {
                String answerUrl = "" + questionId + "/answer/" + id.get(i);
                page.addTargetRequest(answerUrl);
            }
        }
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        System.out.println("有问题问我");
        questionId = "27761934";
        Spider.create(new GetQuestionUrlProcessor())
                .addUrl("" + questionId)
                .thread(10)
                .run();
    }

}
