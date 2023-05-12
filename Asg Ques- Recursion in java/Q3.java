/*
    Q3: Print the max value of the array [ 13, 1, -3, 22, 5].
 */

import java.util.Scanner;

public class Q3 {
    public static int findMax(int[] arr, int len) {
  
        if(len == 0){
            return arr[len];
        }
        else{
            int currentMaxVal = arr[len];
            int max = findMax(arr, len-1);
            return currentMaxVal > max ? currentMaxVal : max;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements ");
        for(int i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }
        int len = arr.length;

        int result = findMax(arr, len -1);
        System.out.println("Max value is " +result);
    }
    
}
