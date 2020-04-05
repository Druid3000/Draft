package modifying_data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JsoupTester3 {
    public static void main(String[] args) {

        String html = "<html><head><title>Sample Title</title></head>"
                + "<body>"
                + "<div id='sampleDiv'><a id='googleA' href='www.google.com'>Google</a></div>"
                +"</body></html>";
        Document document = Jsoup.parse(html);

        Element div = document.getElementById("sampleDiv");
        System.out.println("Outer HTML Before Modification :\n"  + div.outerHtml());
        System.out.println("---");

        div.text("This is a sample content.");
        System.out.println("Outer HTML After Modification :\n"  + div.outerHtml());
        System.out.println("---");

        div.prepend("Initial Text.");
        System.out.println("After Prepend :\n"  + div.outerHtml());
        System.out.println("---");

        div.append("End Text.");
        System.out.println("After Append :\n"  + div.outerHtml());
    }
}
