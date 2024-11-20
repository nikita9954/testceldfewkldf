package org.example;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int counter = 1;
        int[][] table = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();

        }
    }
}

