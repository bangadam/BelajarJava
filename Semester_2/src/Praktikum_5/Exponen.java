package Praktikum_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exponen {
    public static int hitungExponen(int base, int expo) {
        if (expo == 0) {
            return 1;
        } else {
            return base * hitungExponen(base, expo-1);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("2^10 = "+ hitungExponen(2, 10));
        System.out.println("3^5 = "+ hitungExponen(3, 5));
        System.out.println("3^16 = "+ hitungExponen(3, 16));
    }
}
