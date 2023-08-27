package com.bptn.course.week1;

import java.util.Scanner;

public class WordEncryption {
    public static void main(String[] args) {
        //write your code below:
        
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char[] chars = word.toCharArray();

        StringBuilder builder = new StringBuilder();
        for (char chr : chars) {
            if (chr != 'Z' && chr != 'z' && Character.isLetter(chr)) {
                int valueNextAsci = (int) chr + 1;
                builder.append((char) valueNextAsci);

            } else if (chr == 'z') {
                builder.append('a');

            } else if (chr == 'Z') {
                builder.append('A');

            } else if(Character.isDigit(chr)){
                builder.append(chr);
            
            }else {

                builder.append(chr);
        }
        System.out.println(builder);
    }
}
}