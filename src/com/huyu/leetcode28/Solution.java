package com.huyu.leetcode28;

/**
 * @author ：HuYu
 * @date ：Created in 2022/4/27 21:30
 */
public class Solution {

    public int strStr(String haystack, String needle) {

        int length = needle.length();
        int haystackLength = haystack.length();
        if(length==0||haystack.length()==0){
            return -1;
        }
        for (int i = 0; i< haystackLength; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(i+length>haystackLength){
                    return -1;
                }
                boolean flag = true;
                for (int j=0;j<length;j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    return i;
                }
            }
        }
       return -1;
    }


    public static void main(String[] args) {
        String haystack="mississippi", needle="issip";
        Solution solution = new Solution();
        int i = solution.strStr(haystack, needle);
        System.out.println(i);
        System.out.println(haystack.indexOf(needle));
    }
}
