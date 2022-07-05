package com.huyu.leetcode27;

/**
 * @author ：HuYu
 * @date ：Created in 2022/4/27 21:06
 */
public class Solution {


    public int removeElement(int[] nums, int val) {
        if(nums ==null || nums.length ==0){
            return 0;
        }
        int index = nums.length;
        int left=0;
        for (int right=0;right<index;right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;

    }


    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        Solution solution = new Solution();
        int i = solution.removeElement(nums, val);
        System.out.println(i);
    }

}
