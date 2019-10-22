package LatihanUTSAPLRO;

public class No2 {
    public static void main(String[] args) {
        System.out.println("menampilkan 1 - 20");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i <= 20; i++) {
            if (i%2 == 1) {
                System.out.println(i+" ganjil");
            } else if (i%2 == 0) {
                System.out.println(i+" genap");
            }
        }
    }
}
