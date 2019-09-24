package Praktikum_3;

public class Pembalik {

    public String PembalikKata(int size, String word) {
        Stack theStack = new Stack(size);

        // menambahkan karakter ke dalam stack
        for (int i = 0; i < word.length(); i ++)
        {
            theStack.push(word.charAt(i));
        }

        // mengeluarkan karakter dari stack
        String out = "";
        while (!theStack.isEmpty())
        {
            out += theStack.pop();

        }


        return out;
    }
}