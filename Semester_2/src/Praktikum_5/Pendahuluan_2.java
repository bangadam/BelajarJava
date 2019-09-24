package Praktikum_5;

public class Pendahuluan_2 {
    // iterasi
    public static int triangleIter(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i;
        }
        return result;
    }

    // recurcion
    public static int triangleRecur(int n) {
         if (n == 1) {
             return 1;
         } else {
             return n + triangleRecur(n -1);
         }
    }

    public static void main(String[] args) {
        System.out.println(triangleIter(5));
        System.out.println(triangleRecur(5));

    }
}
