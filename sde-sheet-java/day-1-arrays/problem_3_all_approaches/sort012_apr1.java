//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//
//You must solve this problem without using the library's sort function.
//
//
//
//Example 1:
//
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
package problem_3_all_approaches;
//approach 1: sort array . tc = O(NlogN)
//approach 2: count sort by counting 0,1,2 and looping through the count of each number and print it
//approach 3: low mid and high pointers.

//initially low and mid at index 0. high at n-1 index
//o - low-1 : 0
//low - mid-1: 1
//high+1 - n: 2
/*
* while low<=high
* when mid=0: swap low and mid. increase index of low and mid by 1
* when mid =1  move mid ahead by 1
* when mid=2 swap mid and high. move high to previous index
* */

import java.util.Scanner;

public class sort012_apr1 {
    public static void sortArray(int[] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        int temp;
        while(mid<=high){
            switch (nums[mid]) {
//                If the element is 0
                case 0 -> {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                case 2 -> {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter elements into the array of size: " + l);
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        sortArray(arr);
        System.out.print("The sorted array of 0's 1's and 2's is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
