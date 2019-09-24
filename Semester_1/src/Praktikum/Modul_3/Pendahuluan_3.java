package Praktikum.Modul_3;

public class Pendahuluan_3 {
    public static void main(String[] args) {
        int a,b;
        
        a=2;
        b=3;
        
        if (a < b) {
            System.out.println("True");
        }
        
        if (a == b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        if (a != b) {
            System.out.println("false");
        } else if(b > a) {
                System.out.println("True");
        }
        
        if (a == b) {
            System.out.println("true");
        } else if(a < b) {
            System.out.println("oke");      
        } else {
            System.out.println("False");
        } 
        
        switch(a) {
            case 1 :
                System.out.println("Salah");
            break;
            case 3 :
                System.out.println("Salah");
            break;
            case 2 :
                System.out.println("Benar");
            break;
            default: 
                System.out.println("Tidak ada");
            break;
        }
    }
}