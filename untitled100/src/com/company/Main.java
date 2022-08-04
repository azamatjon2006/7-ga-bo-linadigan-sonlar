package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(in);

        int i = 1 ;
        int res  =0;





        while (i <= 100){

        if (i % 7 ==0) {

            res ++;
            System.out.println(i+" ");
        }

         i++;

        }
        System.out.println();
        System.out.println(res);
    }
}
