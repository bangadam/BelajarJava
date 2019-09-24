/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author bangadam
 */
public class Segitiga_bolong {
    public static void main(String[] args) {
        int n;
        int a, b=0, c, d, e;
        
        n = Integer.parseInt(
                JOptionPane.showInputDialog("Masukkan Tinggi Segitiga = "));
        
        a = n;
        e = n-1;

        for(c=1;c<=n;c++){
            b = 1;
            for(d=1;d<=a;d++) {
                if (b<=e) {
                 System.out.print(" ");
                 b++;
                } else {
                    if(d==b||d==a||e==0){
                        System.out.print("*");
                    }else 
                        System.out.print(" ");
                    }
                }
                e--;
                a++;
                System.out.print("\n");
        }
    }
  }

