package com.bptn.course.week1;

import java.util.Scanner;
public class PluralForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("# in:");
        int amt = sc.nextInt();
        sc.nextLine(); //buffer
        System.out.print("word:");
        String word = sc.nextLine();
        if (amt == 0 || amt > 1) {
            if (word.endsWith("fe")) {
                word = word.replace("fe", "ves");
            }  else if (word.endsWith("sh") || word.endsWith("ch")) {
                word = word + "es";
            } else if (word.endsWith("us")) {
                word = word.replace("us", "i");
            } else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
                word = word + 's';
            } else if (word.endsWith("y")) {
                word = word.replace("y", "ies");
            }
            else {
                word = word + 's';
            }
        }else {
            word = word;
        }
        System.out.println(amt + " " + word);
        
         sc.close();
    }
}
