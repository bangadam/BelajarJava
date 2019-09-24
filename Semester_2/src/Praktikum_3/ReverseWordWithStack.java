package Praktikum_3;

import java.util.Stack;

public class ReverseWordWithStack {
    public static void main(String[] args) {
        String word ="kasur";
        Stack<Character> chStack = new Stack<Character>();
        for (int i = 0; i < word.length(); i ++)
        {
            chStack.push(word.charAt(i));
        }

        String out = "";
        while (chStack.size() != 0)
        {
            out += chStack.pop();

        }
        System.out.println(out);
    }
}
