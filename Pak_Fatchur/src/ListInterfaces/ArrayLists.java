package ListInterfaces;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ArrayLists {
    public static void main(String[] args) throws IOException {
//        // create an array list
//        ArrayList al = new ArrayList();
//        System.out.println("Initial size of al: " + al.size());
//
//        // add elements to the array list
//        al.add("C");
//        al.add("A");
//        al.add("E");
//        al.add("B");
//        al.add("D");
//        al.add("F");
//        al.add(1, "A2");
//        System.out.println("Size of al after additions: " + al.size());
//
//        // display the array list
//        System.out.println("Contents of al: " + al);
//
//        // Remove elements from the array list
//        al.remove("F");
//        al.remove(2);
//        System.out.println("Size of al after deletions: " + al.size());
//        System.out.println("Contents of al: " + al);





        String url = "http://en.wikipedia.org/wiki/Java_(programming_language)";
// download and parse the document
        Connection conn = Jsoup.connect(url);
        Document doc = conn.get();
// select the content text and pull out the paragraphs.
        Element content = doc.getElementById("firstHeading");
        Elements heading = content.select("h1");

        Element isiId = doc.getElementById("content");
        Elements isi = isiId.select("p");

//        System.out.println(heading.text());
        System.out.println(isi.text());
    }
}
