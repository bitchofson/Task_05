package com.metanit;

import java.util.stream.Stream;
import java.util.stream.Collectors;

/*
32. s >= 3, s — нечетное (в примере ниже: s = 11)

     0
    123
   4 5 6
  7  8  9
 0   1   2
34567890123
 4   5   6
  7  8  9
   0 1 2
    345
     6

 */

public class Main {

    public static void printRhombus(int n) {


        int s = 0;

        String space = Stream.generate(() -> " ").limit(n).collect(Collectors.joining(" "));

        System.out.println(space.substring(0, n + 1) + s++);

        for (int i = 0; i < n; i++) {
            System.out.print(space.substring(0, n - i));
            for (int j = 0; j < 3; j++) {
                if (s == 10) s = 0;
                    else s = s;
                System.out.print(s++ + space.substring(0, i));
            }
            System.out.println();
        }

        for (int i = 0; i < n * 2 + 3; i++) {
            if (s == 10) s = 0;
                else s = s;
            System.out.print(s++);
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print("\n" + space.substring(0, n - i));
            for (int j = 0; j < 3; j++) {
                if (s == 10) s = 0;
                    else s = s;
                System.out.print(s++ + space.substring(0, i));
            }
        }
        
        System.out.println("\n" + space.substring(0, n + 1) + s);

    }

    public static void main(String[] args) {

           printRhombus(6);


    }
}

