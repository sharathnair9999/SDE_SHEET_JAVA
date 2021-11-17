package Conditionals;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range till where you want Fibonacci Numbers: ");
        int n = sc.nextInt();
        System.out.println("First "+n+" Fibonacci number: ");
        int a = 0;
        int b =1;
        int temp = 1;
        while(temp<=n){
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;
            temp++;

        }
    }
}
