/*
 Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
     That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.

    Constraints : 0<=n<=1e6
    Input1 : n = 10
    Output 1 : -5
    Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
    Input 2 : n = 5
    Output 2 : 3
 */

import java.util.Scanner;

public class Q2 {
    public static int alternateSigns(int n) {

        if( n == 1){
            return n;
        }
        else{
            if(n % 2 == 0){
                return -n + alternateSigns(n - 1);
            }else{
                return n + alternateSigns(n - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();

        int result = alternateSigns(n);
        System.out.println(result);
    }
}
