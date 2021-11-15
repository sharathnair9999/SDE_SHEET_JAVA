// Problem 2: Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//There is only one repeated number in nums, return this repeated number.
//
//You must solve the problem without modifying the array nums and uses only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [1,3,4,2,2]
//Output: 2

package problem_2_all_approaches;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Duplicate_Approach1 {
    public static void main(String[] args) {
//       approach 1: sort the array and find the element that are same on index i and a i+1
//        tc: O(NlogN)
//        solve using hashing.
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        int res=0;
        for (int i = 0; i < l; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < l-1; i++) {
           if(arr[i]==arr[i+1]){
               res+=arr[i];
           }
        }
        System.out.println(res);
    }
}
