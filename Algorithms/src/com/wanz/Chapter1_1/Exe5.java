package com.wanz.Chapter1_1;

public class Exe5 {

    public static void main(String[] args) {
        double x,y;

        x = 0.5;
        y = 0.5;
        print(x,y);

        x = 1;
        print(x,y);

        x = 2;
        print(x,y);

        y = 2;
        print(x,y);

    }

    public static void print(double x, double y) {
        if ( 0 <= x && x <= 1 && 0 <= y && y <= 1) {
            System.out.println(true);
        } else System.out.println(false);
    }
}

/*
Output:
true
true
false
false
*/
