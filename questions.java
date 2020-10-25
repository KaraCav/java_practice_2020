// 1. fizz buzz
import java.util.*; 
public class Exercise116 {
 public static void main(String[] args)
 {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n%d: fizz buzz",i);
            } else if (i % 5 == 0) {
                System.out.printf("\n%d: buzz",i);
            } else if (i % 3 == 0) {
                System.out.printf("\n%d: fizz",i);
            } 
        }
        System.out.printf("\n");
    }
}


// 2. Write a program to find the k largest elements in a given array. Elements in the array can be in any order.
import java.util.*;
public class Solution {
	
    public static void main(String[] args) 
    {
        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int k = 3;
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println(k +" largest elements of the said array are:");
        Arrays.sort(arr, Collections.reverseOrder());         
       for (int i = 0; i < k; i++) 
          System.out.print(arr[i] + " ");
      }      
  }
