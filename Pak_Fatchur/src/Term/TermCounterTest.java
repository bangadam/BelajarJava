package Term;

import Wiki.WikiFetcher;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TermCounterTest {
    private TermCounter counter;

    /**
     * Test digunakan untuk melakukan testing pada kodingan yang telah kita buat apakah
     * sudah sesuai ekspektasi yang diinginkan.
     * TermCounterTest mencoba melakukan testing dengan ekspektasi :
     * - Apakah jumlah count yang di hasilkan berjumlah 4798 keyword ?
     *   jika hasil test dengan hasil ekspektasi sama maka Test dikatakan berhasil/success
     *   jika tidak maka hasil test dikatakan gagal/fail tidak sesuai ekspektasi
     * @throws Exception
     */
    @Before // menandakan pada method ini akan di kerjakan terlebih dahulu
    public void setUp() throws Exception {
        String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";

        WikiFetcher wf = new WikiFetcher();
        Elements paragraphs = wf.readWikipedia(url);

        counter = new TermCounter(url.toString());
        counter.processElements(paragraphs);
    }

    @Test // menandakan pada method ini adalah berupa Test yang akan dikerjakan
    public void testSize() {
        /** helper AsserThat digunakan untuk menyatakan suatu pernyataan apakah benar atau salah
         *  disini digunakan untuk menyatakan apakah hasil TermCounter sesuai dengan jumlah
         *  ekspetasi yang di ingikan yaitu 4798 keyword
        */
        assertThat(counter.size(), is(4798));
    }

}