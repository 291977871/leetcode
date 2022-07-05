package com.huyu.leetcode13;

import sun.misc.Unsafe;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/roman-to-integer/
 * @author ：HuYu
 * @date ：Created in 2022/4/25 22:54
 */
public class Solution {

    public int romanToInt(String s) {
        int per = 0;
        int sum = 0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int integer = getValue(c);
            if(i==s.length()-1){
                sum+=integer;
            }
            if(per == 0){
                per=integer;
                continue;
            }
            if(per >= integer){
                sum+=per;
            }else{
                sum-=per;
            }

            per=integer;
        }
        swfw swfw = new swfw();

        return sum;

    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        Solution solution = new Solution();
        int i = solution.romanToInt(s);
        System.out.println(i);
    }
}
