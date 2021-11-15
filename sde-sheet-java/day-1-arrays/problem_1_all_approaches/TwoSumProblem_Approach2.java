package problem_1_all_approaches;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TwoSumProblem_Approach2 {
  public static int[] getTwoSumIndices(int[] numbers, int target ){
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      if(map.containsKey(target-numbers[i])){
        result[0]=map.get(target-numbers[i]);
        result[1]=i;
        return result;
      }
      map.put(numbers[i],i);
    }
    return result;
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
    System.out.println("Enter the target sum you would like to check with: ");
    int tg = sc.nextInt();
    int[] res = getTwoSumIndices(arr,tg);
    System.out.print("The indices of the numbers which form the target sum are: ");
    for (int re : res) {
      System.out.print(re + " ");
    }
    sc.close();    
  }
  
}
