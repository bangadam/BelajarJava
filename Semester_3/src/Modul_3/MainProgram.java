package Modul_3;

public class MainProgram {
    public static void main(String[] args) {
        int data[] = {-5, -3, -6, -3, -4};

        System.out.print("Data = ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        DataArray test = new DataArray(data);

        System.out.println("");
        // Rata-Rata
        test.setRata();
        cetak("Rata-Rata = "+test.getRata());

        test.setMax();
        cetak("Nilai Max = "+test.getMax());

        test.setMin();
        cetak("Nilai Min = "+ test.getMin());

        int input = -3;
        test.setCekIndex(input);

        System.out.print("Nilai "+input+" berada di index = ");
        for (int i = 0; i < test.cekIndex.length; i++) {
            cetakindex(test, test.getCekIndex());
        }

    }

    public static void cetak(String a) {
        System.out.println(a);
    }

    public static void cetakindex(DataArray dataArray, int[] cari) {
        for (int i = 0; i < cari.length; i++) {
            if (cari[i] != 0) {
                System.out.print(cari[i]);
                System.out.print(" ");
            }
        }
    }
}
