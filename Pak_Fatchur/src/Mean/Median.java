package Mean;

public class Median {
    public static void main(String[] args) {
        Object ob = new Object();
        int bilangan[] = {1,2,4,3,5};
        ob.setBilangan(bilangan);
        ob.tampil(bilangan);
        ob.setUrut(bilangan);
        System.out.println(ob.getUrut());
        ob.setMedian(bilangan);
        ob.tampil(ob.getMedian());
    }
}
