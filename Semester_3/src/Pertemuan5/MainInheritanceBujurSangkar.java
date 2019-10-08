package Pertemuan5;

public class MainInheritanceBujurSangkar extends InheritanceBujurSangkar {
    public static void main(String[] args) {
         MainInheritanceBujurSangkar mainInheritance = new MainInheritanceBujurSangkar();

         mainInheritance.setSisi(3);
         mainInheritance.cetak(mainInheritance.getSisi()+"");

         mainInheritance.setLuas(5);
         mainInheritance.cetak(mainInheritance.getLuas()+"");

         mainInheritance.keterangan();
//         mainInheritance.keterangan_parent();

    }
}
