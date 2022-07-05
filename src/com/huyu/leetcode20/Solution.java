package com.huyu.leetcode20;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author ：HuYu
 * @date ：Created in 2022/4/25 23:42
 */
public class Solution {

    public boolean isValid(String s) {
       int length = s.length();
       if(length%2 ==1){
           return false;
       }
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<>();
        for(int i=0;i<length;i++){
            char c = s.charAt(i);
            if(pairs.containsKey(c)){
                if(stack.isEmpty() ||stack.pop() != pairs.get(c)){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
