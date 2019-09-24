package Wiki;

import java.io.IOException;
import java.util.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

public class WikiNodeExample {

    public static void main(String[] args) throws IOException {
        // mempersiapkan alamat yang akan di ambil sourcenya
        String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";

        // mempersiapkan koneksi ke url yang di tuju
        Connection conn = Jsoup.connect(url);
        // mendapatkan source dari alamat yang dituju
        Document doc = conn.get();

        // menyeleksi source yang didapat berdasarkan id mw-content-text
        Element content = doc.getElementById("mw-content-text");

        // menyeleksi lebih dalam/detail dengan memilih tag <p>
        Elements paras = content.select("p");
        // mendapatkan data pada array ke 1
        Element firstPara = paras.get(1);

        // menampilkan data menggunakan metode rekursif
        recursiveDFS(firstPara);
        System.out.println();

        // menampilkan data menggunakan metode iterasi
        iterativeDFS(firstPara);
        System.out.println();

        // menampilkan data menggunakan class wikinodeIterable
        Iterable<Node> iter = new WikiNodeIterable(firstPara);
        for (Node node: iter) {
            if (node instanceof TextNode) {
                System.out.print(node);
            }
        }
    }

    private static void iterativeDFS(Node root) {
        Deque<Node> stack = new ArrayDeque<Node>();
        stack.push(root);

        // cek jika stack tidak kosong maka jalankan
        while (!stack.isEmpty()) {

            // mengeluarkan data dari stack
            Node node = stack.pop();
            if (node instanceof TextNode) {
                System.out.print(node);
            }

            // memasukkan data pada stack
            List<Node> nodes = new ArrayList<Node>(node.childNodes());
            Collections.reverse(nodes);

            for (Node child: nodes) {
                stack.push(child);
            }
        }
    }

    // pada method ini menggunakan metode recursive
    private static void recursiveDFS(Node node) {
        if (node instanceof TextNode) {
            System.out.print(node);
        }
        for (Node child: node.childNodes()) {
            recursiveDFS(child);
        }
    }
}