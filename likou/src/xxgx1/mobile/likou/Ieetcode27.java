package xxgx1.mobile.likou;

public class Ieetcode27 {
//快慢指针法
public static int removeElement(int[] nums, int val) {
    int slowIndex = 0;
    for (int fastIndex = 0; fastIndex <nums.length ; fastIndex++) {
        if (nums[fastIndex] != val){
            nums[slowIndex] = nums[fastIndex];
            slowIndex++;
        }
    }
    return slowIndex;
}

    public static void main(String[] args) {
        int []nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
}