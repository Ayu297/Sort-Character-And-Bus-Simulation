package org.example;

import java.util.Scanner;

public class Psbb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number of family : ");
        int family= scan.nextInt();

        if(family <= 0){
            System.out.println("Input invalid");
        }

        System.out.println("Input members : ");
        int [] members = new int[family];
        for (int i = 0; i < family; i++) {
            members[i] = scan.nextInt();
        }

        int totalMembers = 0;
        for (int member : members) {
            if (member <= 0) {
                System.out.println("Invalid input");
                return;
            }
            totalMembers += member;
        }

        if(totalMembers != family){
            System.out.println("Input must be equal with count of family");
        }

        int minibus = 0;
        int passengers = 0;
        int familyCount = 0;

        for (int i = 0; i < family; i++) {
            if (passengers + members[i] > 4 || familyCount >= 2) {
                minibus++;
                passengers = 0;
                familyCount = 0;
            }

            passengers += members[i];
            familyCount++;
        }

        if (passengers > 0 ||familyCount > 0) {
            minibus++;
        }

        System.out.println("Minibus needed : " + minibus);

        scan.close();
    }
}
