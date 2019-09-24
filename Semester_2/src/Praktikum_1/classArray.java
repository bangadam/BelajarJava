package Praktikum_1;

public class classArray {
    public int a;

    public classArray() {
        a = 100;
    }

    public boolean test() {
        return true;
    }

    public void test2() {
        System.out.println("oke");
    }

    public static void main(String[] args) {
        classArray arr = new classArray();

        System.out.println(arr.test());
        arr.test2();
    }
}
