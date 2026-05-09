package OperationsProblems;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = sc.nextInt();

        while(number>0){
            int digit = number%10;
            sum = sum + digit;
            number = number/10;
        }
        System.out.println(sum);
        sc.close();
    }
}