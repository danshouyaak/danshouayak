package xxgx1.mobile.likou;

import java.util.Arrays;

public class Ieetcode977 {
    public static int[] sortedSquares(int [] nums){

        for (int i = 0; i < nums.length; i++) {
            nums [i] *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {

            for (int j = 1; j < nums.length; j++) {
            if (nums[j-1] > nums[j] ){
                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
            }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] nums ={-1,-3,-4,0,5,2};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
