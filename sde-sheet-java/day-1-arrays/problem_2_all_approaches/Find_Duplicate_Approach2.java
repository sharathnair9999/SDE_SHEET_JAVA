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

import java.util.Scanner;

public class Find_Duplicate_Approach2 {
    //    two pointer approach to find the repeating number in a circular link way.
    public static int removeDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the elements in the array of size: " + l);
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The duplicate element from the array is: " + removeDuplicate(arr));
    }
}
