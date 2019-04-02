package com.wanz.Chapter1_1;

import java.util.Scanner;

public class Exe3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) System.out.println("equal");
        else System.out.println("not equal");

    }
}

/*
Input:
1 1 1

Output:
equal

Input:
1 2 2

Output:
not equal

 */
