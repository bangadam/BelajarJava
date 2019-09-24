package Term;

import Wiki.WikiFetcher;
import Wiki.WikiNodeIterable;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Encapsulates a map from search term to frequency (count).
 * Pada program termcounter berguna untuk menghitung suatu kata kunci/huruf pada web yang dituju,
 * jadi setiap kata kunci akan di cari lalu dihitung jumlah banyaknya kata kuncu tersebut.
 *
 * @author downey
 *
 */
public class TermCounter {
    // untuk menyimpan data keywords menggunakan library Map dengan bentuk ["keywords", jumlah kata]
    private Map<String, Integer> map;
    // deklarasi label
    private String label;

    // merupakan constructor TermCounter
    public TermCounter(String label) {
        this.label = label;
        this.map = new HashMap<String, Integer>();
    }

    // mendapatkan nilai dari atribut label atau keyword/text yang telah disimpan
    public String getLabel() {
        return label;
    }

    /**
     * Returns the total of all counts.
     *  method ini berfungsi untuk mendapatkan nilai ukuran dari
     *  jumlah banyaknya data keywords yang tersimpan di Map
     * @return
     */
    public int size() {
        int total = 0;
        for (Integer value: map.values()) {
            total += value;
        }
        return total;
    }

    /**
     * Takes a collection of Elements and counts their words.
     * method ini berfungsi mengambil dan menghitung semua keyword dari elemen web yang telah didownload
     * @param paragraphs
     */
    public void processElements(Elements paragraphs) {
        for (Node node: paragraphs) {
            // proses mengambil dan menghitung elemen
            processTree(node);
        }
    }

    /**
     * Finds TextNodes in a DOM tree and counts their words.
     * method mencari dan menghitung keyword di dalam DOM tree dari elemen tadi
     * @param root
     */
    public void processTree(Node root) {
        // NOTE: we could use select to find the TextNodes, but since
        // we already have a tree iterator, let's use it.
        for (Node node: new WikiNodeIterable(root)) {
            // cek apabila nilai node bertipe data sama dengan TextNode
            if (node instanceof TextNode) {
                // mendapatkan keyword/text pada elemen
                processText(((TextNode) node).text());
            }
        }
    }

    /**
     * Splits `text` into words and counts them.
     * method ini berguna untuk menghitung dan juga memisahkan antara keyword/text dengan elemen2 html yang telah di download.
     * proses memisahkannya menggunakan ReGex atau Regular Expression
     * @param text  The text to process.
     */
    public void processText(String text) {
        // replace punctuation with spaces, convert to lower case, and split on whitespace
        String[] array = text.replaceAll("\\pP", " "). // mengganti tag elemen misal <p> diganti dengan spasi
                toLowerCase(). // mengubah keyword/text menjadi huruf kecil
                split("\\s+"); // menjadikan keyword ke sebuah array dengan pemisah spasi

        for (int i=0; i<array.length; i++) {
            // menyimpan keyword ke dalam variabel yang nanti akan digunakan untuk
            // menghitung jumlah keyword/text
            String term = array[i];
            // proses menghitung jumlah keyword
            incrementTermCount(term);
        }
    }

    /**
     * Increments the counter associated with `term`.
     * method ini digunakan untuk menghitung banyaknya jumlah tiap keywords
     * @param term
     */
    public void incrementTermCount(String term) {
        // System.out.println(term);
        put(term, get(term) + 1);
    }

    /**
     * Adds a term to the map with a given count.
     * method ini berfungsi untuk menambahakan keyword/text
     * ke dalam map dan hasil perhitungan jumlah keyword
     * @param term
     * @param count
     */
    public void put(String term, int count) {
        map.put(term, count);
    }

    /**
     * Returns the count associated with this term, or 0 if it is unseen.
     *  method ini berfungsi untuk mendapatkan jumlah banyaknya per keyword
     * @param term
     * @return
     */
    public Integer get(String term) {
        Integer count = map.get(term);
        return count == null ? 0 : count;
    }

    /**
     * Returns the set of terms that have been counted.
     * method ini berfungsi untuk menyiapkan jumlah keyword yang sudah terhitung
     * @return
     */
    public Set<String> keySet() {
        return map.keySet();
    }

    /**
     * Print the terms and their counts in arbitrary order.
     * method ini befungsi untuk menampilkan hasil keyword dan jumlah banyaknya per
     * keyword
     */
    public void printCounts() {
        for (String key: keySet()) {
            Integer count = get(key);
            System.out.println(key + ", " + count);
        }
        System.out.println("Total of all counts = " + size());
    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // menyiapkan alamat web yang akan di download
        String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";

        // menggunakan WikiFetcher untuk mengambil semua elemen pada web
        WikiFetcher wf = new WikiFetcher();
        // proses mengambil semua elemen pada web
        Elements paragraphs = wf.fetchWikipedia(url);

        // menyiapkan alamat web pada TermCounter yang nanti akan dihitung jumlah
        // per keyword pada web tersebut
        TermCounter counter = new TermCounter(url.toString());
        // proses mengambil keyword dan menghitung jumlah keyword
        counter.processElements(paragraphs);
        // menampilkan hasil dan jumlah per keyword
        counter.printCounts();
    }
}