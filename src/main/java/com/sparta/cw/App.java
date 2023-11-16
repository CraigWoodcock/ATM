package com.sparta.cw;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int[] values = {50,20,10,5,2,1};
        int[] quantity = {12,20,50,100,250,500};

//        Scanner reader = new Scanner(System.in);
        System.out.println("The values remaining are: ");

//       int amountToWithdraw = reader.nextInt();
        int amountToWithdraw = 157;

        withdrawValue(values,quantity,amountToWithdraw);
    }
    public static void  withdrawValue(int[] values, int[]quantity, int amountToWithdraw){


        for (int i = 0; i<values.length; i++ ){
            int calc = amountToWithdraw/values[i];

            if (calc > 0 ){
                quantity[i] -= calc;
                amountToWithdraw -= (calc * values[i]);
            }
            System.out.println(values[i]+" "+ quantity[i]);

        }

    }


}
