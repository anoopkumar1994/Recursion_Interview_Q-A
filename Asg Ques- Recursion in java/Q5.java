/*
    Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum 
    of every digit in that number raised to the power of total digits in that number is equal to the number.
    Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)
    Input1 : 153
    Output1 : Yes
    Input 2 : 134
    Output2 : No
 */

//  import java.util.Scanner;

// public class Q5 {
//     public static boolean armstrongNumber(int n, int sum, int multi) {
//         if(n <= 0){
//             if (sum == 0) {
//                 return true;
//             } else {
//                 return false;
//             }
//         }
//         else{
//             return armstrongNumber(n / 10, n % 10, multi * multi *multi);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter a number ");
//         int n = s.nextInt();
//         int sum = 0;
//         int multi = 1;

//         boolean result = armstrongNumber(n, sum, multi);
//         if (result) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }
//     } 
// }
