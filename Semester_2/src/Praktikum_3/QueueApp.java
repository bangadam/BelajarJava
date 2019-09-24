package Praktikum_3;

public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(4);

        // memasukkan data ke Queue
        System.out.println(">> Beberapa orang mulai mengantri");
        theQueue.insert("Andi");
        theQueue.insert("Ahmad");
        theQueue.insert("Satrio");
        theQueue.insert("Afrizal");
        theQueue.insert("Sukran");
        theQueue.insert("Mahmud");
        System.out.println(" ");

        // mengeluarkan isi Queue
        System.out.println();
        System.out.println(">> isi antrian");
        theQueue.display();
        System.out.println();

        // satu per satu antrian hapus
        System.out.println();
        System.out.println(">> satu persatu keluar antrian");
        while (!theQueue.isEmpty()) {
            System.out.println(theQueue.remove()+" Keluar dari antrian");
            theQueue.display();
            System.out.println(" ");
        }

        // cek antrian
        System.out.println("Antrian kosong");
        System.out.println(theQueue.size()+" Person");
    }
}
