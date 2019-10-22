package Modul_6;

import javax.swing.*;

public class prak6 {
    private static String univ;

    protected prak6(){
        univ = null;
    }
    protected prak6(String univ){
        this.univ = univ;
    }

    protected static String getUniv() {
        return prak6.univ;
    }

    protected static void setUniv() {
        univ = JOptionPane.showInputDialog("masukkan nama Universitas = ");
        prak6.univ = univ;
    }
    protected void tamppil(String a){
        System.out.println(a);
    }
}
