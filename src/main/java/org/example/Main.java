package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan text : ");
        String input = scan.nextLine();


        String vowelsResult = "";
        String consonantResult = "";

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'a':
                    vowelsResult += input.charAt(i);
                    break;
                case 'e':
                    vowelsResult += input.charAt(i);
                    break;
                case 'i':
                    vowelsResult += input.charAt(i);
                    break;
                case 'o':
                    vowelsResult += input.charAt(i);
                    break;
                case 'u':
                    vowelsResult += input.charAt(i);
                    break;
                default:
                    consonantResult += input.charAt(i);


            }


        }
        System.out.println(vowelsResult);
        System.out.println(consonantResult);
    }
}
