package OperationsProblems;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        number = Math.abs(number);
        int count = 0;

        if(number==0){
            System.out.println("No.of digits = 1");
        }
        else {
            while(number>0){
                count = count+1;
                number = number/10;
            }
            System.out.println("No.of digits = "+count);
        }

        sc.close();

    }
}
