public class Rekursif {
    public static int jumlahGenap(int N) {
        if (N > 0) {
            if (N%2 == 0) {
                return jumlahGenap(N-1) + N++;
            }
            jumlahGenap(N-1);
        }
        return N;
    }

    public static void main(String[] args) {
        System.out.println(jumlahGenap(5));
    }
}
