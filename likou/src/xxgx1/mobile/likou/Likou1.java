package xxgx1.mobile.likou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Likou1 {
    public static void main(String[] args) {
//        int [] arr = {};
//        int target = 9;

       // System.out.println(Arrays.toString(twoSum(arr,target)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,5},9)));
    }

    public static int [] twoSum(int [] nums , int target){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
           if (map.containsKey(target - nums[i])){
               return new int[] {map.get(target - nums[i]), i};
           }
           map.put(nums[i],i );
        }
        return null;
    }

}
