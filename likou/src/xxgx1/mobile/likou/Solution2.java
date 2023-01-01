package xxgx1.mobile.likou;

import java.util.Arrays;

public  class Solution2 {
    static int [] searchRange(int[]nums,int target){
        int leftBorder = getLeftBorder(nums,target);
        int rightBorder = getRightborder(nums,target);

        if (leftBorder == -2 || rightBorder == -2){
            return new int[]{-1,-1};
        }
        if (rightBorder - leftBorder > 1){
            return new int[]{leftBorder + 1,rightBorder + 1};
        }
        return new int[]{-1,-1};
    }

     static int getRightborder(int[]nums ,int targer){
        int left = 0;
        int right = nums.length-1;
        int rightBorder = -2;
        while (left <= right){
            int mid = (left+right)/2;

            if (nums[mid] > targer){
                right = mid -1;
            } else if (nums[mid]<targer) {//寻找右边界。num[mid]==target 的时候更新left
                left = mid + 1;
                rightBorder = left;
            }
        }
        return rightBorder;
    }
   static int getLeftBorder(int []nums,int targer){
        int left = 0;
        int right = nums.length;

        int leftborder = -2;
        while (left < right){
            int mid = (left+right)/2;//每一次都需要重新赋值
            if (nums[mid]>targer){
                right = mid - 1;
                leftborder = right;
            } else if (nums[mid]<targer) {
                left = mid + 1;
            }
        }
        return leftborder;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
