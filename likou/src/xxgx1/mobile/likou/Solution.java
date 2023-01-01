package xxgx1.mobile.likou;

import java.util.Scanner;

public class Solution {
    public static int search(int[]nums,int target){
        int left = 0,right = nums.length ;
        while (left<right){
            int mid = left+((right - left)>>1);
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                left = mid +1;
            } else if (nums[mid] > target) {
                right = mid - 1  ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查询的数字：");
        int target = scanner.nextInt();
        int[]nums = {1,2,3,4,7,9,10};
       // int target = 9;
        System.out.println(search(nums, target));
    }
}
