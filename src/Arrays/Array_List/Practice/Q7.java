package Arrays.Array_List.Practice;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15,3,6};
        System.out.println(Arrays.toString(twoSum(nums,9)));
    }

        static int[] twoSum(int[] nums, int target) {

        int start =0;
        int end = nums.length-1;
        int[] X = {};

            for(int i = start;i<nums.length;i++){
                for(int j= end;j>=start;j--){
                    if(nums[i] + nums[j] == target){
                       X = new int[]{nums[i],nums[j]};
                    }
                }
                return X;
            }
            return new int[]{};
        }
    }

