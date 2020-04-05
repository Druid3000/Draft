package input;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTester2 {
    public static void main(String[] args) {
        String html = "<div><p>Sample Content</p>";

        Document document = Jsoup.parse(html);

        Element body = document.body();

        Elements paragraphs = body.getElementsByTag("p");

        for(Element paragraph : paragraphs){
            System.out.println(paragraph.text());
        }
    }
}
