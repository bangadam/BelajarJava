import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan_1 {

    public static void main(String[] args) throws IOException {
        // Masukkan Nilai
        int a = 80;
        
        if (a >= 85 && a <=100) {
            System.out.println("A");
        } else if(a >= 80 &&  a <=84 ) {
            System.out.println("B+");
        } else if(a >= 75 &&  a <=79 ) {
            System.out.println("B");
        } else if(a >= 70 &&  a <=74 ) {
            System.out.println("C+");
        } else if(a >= 60 &&  a <=69 ) {
            System.out.println("C");
        } else if(a >= 50 &&  a <=59 ) {
            System.out.println("D");
        } else if(a <= 49) {
            System.out.println("E");
        } else {
            System.out.println("angka yang anda masukkan tidak valid");
        }
        
        // masukkan nilai
        int b = 100;
        
        switch(b) {
            case 40 :
            case 41 :
            case 42 :
            case 43 :
            case 44 :
            case 45 :
            case 46 :
            case 47 :
            case 48 :
            case 49 :    
                System.out.println("E");
            break;
            case 50 :
            case 51 :
            case 52 :
            case 53 :
            case 54 :
            case 55 :
            case 56 :
            case 57 :
            case 58 :
            case 59 :
                System.out.println("D");
            break;
            case 60 :
            case 61 :
            case 62 :
            case 63 :
            case 64 :
            case 65 :
            case 66 :
            case 67 :
            case 68 :
            case 69 :
                System.out.println("C");
            break;
            case 70 :
            case 71 :
            case 72 :
            case 73 :
            case 74 :
                System.out.println("C+");
            break;
            case 75 :
            case 76 :
            case 77 :
            case 78 :
            case 79 :
                System.out.println("B");
            break;
            case 80 :
            case 81 :
            case 82 :
            case 83 :
            case 84 :
                System.out.println("B+");
            break;
            case 85 :
            case 86 :
            case 87 :
            case 88 :
            case 89 :
            case 90 :
            case 91 :
            case 92 :
            case 93 :
            case 94 :
            case 95 :
            case 96 :
            case 97 :
            case 98 :
            case 99 :
            case 100 :
                System.out.println("A");
            break;
            
            default:
                System.out.println("E");
            break;
        }
        
    }

}
