package modifying_data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTester1 {

    public static void main(String[] args) {
        String html = "<html><head><title>Sample Title</title></head>"
                + "<body>"
                + "<p>Sample Content</p>"
                + "<div id='sampleDiv'><a id='googleA' href='www.google.com'>Google</a></div>"
                + "<div class='comments'><a href='www.sample1.com'>Sample1</a>"
                + "<a href='www.sample2.com'>Sample2</a>"
                + "<a href='www.sample3.com'>Sample3</a><div>"
                +"</div>"
                + "<div id='imageDiv' class='header'><img name='google' src='google.png' />"
                + "<img name='yahoo' src='yahoo.jpg' />"
                +"</div>"
                +"</body></html>";

        Document document = Jsoup.parse(html);

        //Example: set attribute
        Element link = document.getElementById("googleA");
        System.out.println("Outer HTML Before Modification :"  + link.outerHtml());
        link.attr("href","www.yahoo.com");
        System.out.println("Outer HTML After Modification :"  + link.outerHtml());
        System.out.println("---");

        //Example: add class
        Element div = document.getElementById("sampleDiv");
        System.out.println("Outer HTML Before Modification :"  + div.outerHtml());
        link.addClass("header");
        System.out.println("Outer HTML After Modification :"  + div.outerHtml());
        System.out.println("---");

        //Example: remove class
        Element div1 = document.getElementById("imageDiv");
        System.out.println("Outer HTML Before Modification :"  + div1.outerHtml());
        div1.removeClass("header");
        System.out.println("Outer HTML After Modification :"  + div1.outerHtml());
        System.out.println("---");

        //Example: bulk update
        Elements links = document.select("div.comments a");
        System.out.println("Outer HTML Before Modification :"  + links.outerHtml());
        links.attr("rel", "nofollow");
        System.out.println("Outer HTML Before Modification :"  + links.outerHtml());
    }
}
