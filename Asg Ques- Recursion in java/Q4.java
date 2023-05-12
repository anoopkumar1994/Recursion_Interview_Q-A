/*
     Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10].
 */

import java.util.Scanner;

public class Q4 {
    public static int sumOfValues(int arr[], int index) {
        if(index < 0){
            return 0;
        }
        else{
            return arr[index] + sumOfValues(arr, index-1);
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

        int sum = sumOfValues(arr, len -1);
        System.out.println("Total sum is " + sum);
    }
}
