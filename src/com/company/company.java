package com.company;

import java.util.Scanner;

public class company {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count =0;
        int num2;
        int num3;
        int num4;
        int ara[] = new int[8];
        for (int i=0;i<8;i++)
        {
            num4=num/10;
            count++;
            if (num4<1)
            {
                //System.out.println(count);
                break;
            }
        }
        for (int i=0;i<count;i++) {
            num2 = num % 10;
            num3 = num/10;
            ara[i] = num2;
            num=num3;
            if (num<10)
            {
                ara[i]=num3;
                break;
            }
        }
        int i=0;
        while (i<count)
        {
            //i=i+1;
            System.out.println(ara[i]*Math.pow(10,i));
            if (ara[i]==0)
            {
                break;
            }
            i++;
        }
        }
    }

