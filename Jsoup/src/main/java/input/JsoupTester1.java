package input;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTester1 {
    public static void main(String[] args) {

        String html = "<html><head><title>Sample Title</title></head>" +
                "<body>" +
                    "<p>Sample Content1</p>" +
                    "<p>Sample Content2</p>" +
                "</body> " +
                "</html>";

        Document document = Jsoup.parse(html);

        System.out.println(document.title());

        Elements paragraphs = document.getElementsByTag("body");

        for (Element paragraph : paragraphs) {
            System.out.println(paragraph.text());
        }
    }
}
