/*
 Q1 : Given an integer, find out the sum of its digits using recursion.
    Input: n= 1234
    Output: 10
    Explanation: 1+2+3+4=10
 */

import java.util.Scanner;

public class Q1{
    public static int findSum(int n) {
        if(n < 10){
            return n;
        }
        else{
            return n % 10 + findSum(n/10);

        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enetr a number : ");
        int n = s.nextInt();

        System.out.println("Total sum is " + findSum(n));
    }
 }