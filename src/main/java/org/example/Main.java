package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = "Nestooo";
        char[] ch = str.toCharArray();

        System.out.println(str.indexOf("t"));

        for (char arr : ch) {
            System.out.println(ch);
        }
    }
}