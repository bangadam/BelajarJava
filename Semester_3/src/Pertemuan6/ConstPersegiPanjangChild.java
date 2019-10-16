package Pertemuan6;

public class ConstPersegiPanjangChild extends ConsPersegeiParent {
    private int lebar, luas;

    protected ConstPersegiPanjangChild() {

    }

    protected ConstPersegiPanjangChild(int lebar, int panjang) {
        super(panjang);
        this.lebar = lebar;
        setLuas();
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas() {
        this.luas = getPanjang() * getLebar();
    }
}
