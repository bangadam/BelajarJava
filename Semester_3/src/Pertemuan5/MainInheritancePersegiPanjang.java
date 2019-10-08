package Pertemuan5;

public class MainInheritancePersegiPanjang extends InheritancePersegiPanjang {
    public static void main(String[] args) {
        MainInheritancePersegiPanjang ob = new MainInheritancePersegiPanjang();

        ob.setLebar(4);
        ob.setPanjang(5);
        ob.setLuas(ob.getPanjang(), ob.getLebar());
        ob.cetak(ob.getLuas()+"");
    }
}
