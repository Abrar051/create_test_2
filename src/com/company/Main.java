package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int a = 5;
        int input_sc;
        System.out.print ("Enter number 1 : ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = input.nextInt();
        System.out.println();
        System.out.print("Enter operation method : for + input 1 , - input 2 , * input 3 and / input 4 : ");
        System.out.print ("");
        int option = input.nextInt();
        switch (option)
        {
            case 1:
                float res=num1+num2;
                System.out.println(res);
                break;
            case 2:
                float res2=num1-num2;
                System.out.println(res2);
                break;
            case 3:
                float res3=num1*num2;
                System.out.println(res3);
                break;
            case 4:
                float res4=num1/num2;
                System.out.println(res4);
                break;
        }
    }
}
