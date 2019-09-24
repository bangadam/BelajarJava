package Indexter;

import Term.TermCounter;
import Wiki.WikiFetcher;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Encapsulates a map from search term to set of TermCounter.
 * Index adalah struktur data yang dapat memungkinkan mengidentifikasi suatu
 * pencarian keyword dan mencari kata kunci yang relevan disetiap halaman web yang di crawler
 * misal :
 * saat kita mencari keyword "Java" dan "Programming" maka kita dapat mengidentifikasi
 * kedua keyword tersebut dan menjadi dua halaman yang berbeda. halaman dengan keyword
 * "Java" maka akan muncul halaman tentang pulau jawa, suatu nama kopi, dan bahasa pemrograman
 * Sedangkan halaman dengan keyword "Programming" maka akan muncul halaman mengenai beberapa
 * bahasa pemrograman yang berbeda.
 * Nah dari kedua keyword tersebut kita berharap dapat menghapus suatu halaman yang tidak relevan
 * dengan keyword yang kita cari, cara inilah yang disebut dengan INDEXER.
 * @author downey
 *
 */
public class Index {
    // HashMap digunakan untuk menyimpan suatu data
    private Map<String, Set<TermCounter>> index = new HashMap<String, Set<TermCounter>>();

    /**
     * Adds a TermCounter to the set associated with `term`.
     * menambahkan hasil keyword dan jumlah keyword yang nanti akan di simpan
     * pada HashSet
     * @param term
     * @param tc
     */
    public void add(String term, TermCounter tc) {
        Set<TermCounter> set = get(term); // mendapatkan keyword

        // if we're seeing a term for the first time, make a new Set
        if (set == null) {
            set = new HashSet<TermCounter>();
            index.put(term, set); // menambahkan keyword kedalam HashMap
        }
        // otherwise we can modify an existing Set
        set.add(tc);
    }

    /**
     * Looks up a search term and returns a set of TermCounters.
     * menyiapkan suatu tempat untuk menampung data keyword dengan tipe data TermCounter
     * @param term
     * @return
     */
    public Set<TermCounter> get(String term) {
        return index.get(term);
    }

    /**
     * Prints the contents of the index.
     * Menampilkan hasil Index yang terdiri dari keyword, alamat web dan jumlah banyaknya keyword tersebut.
     */
    public void printIndex() {
        // loop through the search terms
        for (String term: keySet()) {
            System.out.println(term);

            // for each term, print the pages where it appears
            Set<TermCounter> tcs = get(term);
            for (TermCounter tc: tcs) {
                Integer count = tc.get(term);
                System.out.println("    " + tc.getLabel() + " " + count);
            }
        }
    }

    /**
     * Returns the set of terms that have been indexed.
     * mengembalikan set/tempat menampung data tadi yang sudah terisi oleh data terindex.
     * @return
     */
    public Set<String> keySet() {
        return index.keySet();
    }

    /**
     * Add a page to the index.
     * menambahkan suatu halaman ke dalam proses index.
     * @param url         URL of the page.
     * @param paragraphs  Collection of elements that should be indexed.
     */
    public void indexPage(String url, Elements paragraphs) {
        // make a TermCounter and count the terms in the paragraphs
        TermCounter tc = new TermCounter(url);
        tc.processElements(paragraphs);

        // for each term in the TermCounter, add the TermCounter to the index
        for (String term: tc.keySet()) {
            add(term, tc); // menambahkan keyword dan hasil crawler
        }
    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // menggunakan Class WikiFetcher untuk melakukan crawler/download suatu halaman
        // web yang akan diambil data2nya
        WikiFetcher wf = new WikiFetcher();
        Index indexer = new Index();

        String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";
        Elements paragraphs = wf.fetchWikipedia(url);
        // proses mengindex suatu halaman
        indexer.indexPage(url, paragraphs);

        url = "https://en.wikipedia.org/wiki/Programming_language";
        paragraphs = wf.fetchWikipedia(url);
        // proses mengindex suatu halaman
        indexer.indexPage(url, paragraphs);

        // menampilkan hasil akhir dari kedua halaman yang sudah di index
        indexer.printIndex();
    }
}
