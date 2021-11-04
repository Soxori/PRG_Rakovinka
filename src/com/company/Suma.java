package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int output = 0;

        System.out.println("Enter number");
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(sc.hasNext()) {
            list.add(sc.nextInt());
        }

        for (Integer integer : list) {
            x += integer;
        }

        double idk = (double) x / list.size();

        for (Integer integer : list) {
            if (integer >= idk) {
                output = output + integer;
            }
        }
        System.out.println(output);
    }
}
