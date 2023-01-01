package xxgx1.mobile.likou;

public class Solution1 {
    public static int search(int [] nums,int target){
        int left = 0 , right = nums.length;

        while (left <= right){
            int mid = (left+right)/2;
            if (target == nums[mid]){
                return mid;
            } else if (nums[mid]>target) {
                right = mid-1;
            } else if (nums[mid]<target) {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int[]nums = {1,2,3,5,7,9,10};
        int target = 9;
        System.out.println(search(nums, 4));
    }
}
