package input;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupTester3 {
    public static void main(String[] args) throws IOException {
        String url = "http://www.google.com";
        Document document = Jsoup.connect(url).get();
        System.out.println(document.title());
    }
}
