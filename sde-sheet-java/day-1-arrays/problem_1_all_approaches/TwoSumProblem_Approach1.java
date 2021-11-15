// Problem Statement:  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//   You may assume that each input would have exactly one solution, and you may not use the same element twice.
//   Example: 
//   Input: nums = [3,2,4], target = 6
//   Output: [1,2]

package problem_1_all_approaches;

import java.util.Scanner;
public class TwoSumProblem_Approach1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of array: ");
    int l = sc.nextInt();
    int[] arr = new int[l];
    System.out.println("Enter elements into the array of size: " + l);
    for (int i = 0; i < l; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the target sum you would like to check with: ");
    int tg = sc.nextInt();
    int ind1 = 0; //first index to return
    int ind2 = 0;//second index to return
    int flag = 0;//check whether there are valid indices or not.
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == tg) { //if sum of two numbers in the array is equal to the target

          ind1 += i; // store first index
          ind2 += j; // store second index
          flag += 1; // set flag to true

        } else {
          ind1 += 0; //no valid index
          ind2 += 0;// no valid index
          flag += 0;// set flat to false

        }
      }
    }

    if (flag == 1) { // if flag true then :
      System.out.println("The target resulting indices for the array are: " + ind1 + " and " + ind2);
    } else {
      System.out.println("The target cannot be found in the array!");
    }

    sc.close();
  }
}


