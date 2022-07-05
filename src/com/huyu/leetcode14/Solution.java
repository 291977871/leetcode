package com.huyu.leetcode14;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * https://leetcode-cn.com/problems/longest-common-prefix/
 * @author ：HuYu
 * @date ：Created in 2022/4/25 23:09
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length==0) {
            return "";
        }
        String publicPer = strs[0];
        for (int i=1;i<strs.length;i++){

            if (!strs[i].startsWith(publicPer)) {
                int length = publicPer.length()-1;
                boolean flag = true;
                for (int j = length ;j>0;j--){
                    String substring = publicPer.substring(0, j);
                    if(strs[i].startsWith(substring)){
                        publicPer = substring;
                        flag =false;
                        break;
                    }
                }
                if (flag) {
                    return "";
                }
            }
        }
        return publicPer;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] str = new String[]{"flower","flow","flight"};
        String s = solution.longestCommonPrefix(str);
        System.out.println(s);
    }

}
