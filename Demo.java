package Exercise;

import java.util.*;

/**
 * description:JavaSE teaching
 * author:sdjady
 * date:2021-03-28
 * time:10:09
 */
public class Demo {
    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int a = 0;
        int[] index = new int[128];
        for (int j = 0,i = 0; j < s.length(); j++) {
            i = Math.max(index[s.charAt(j)], i);//判断这元素是否是第一次出现
            a = Math.max(a, j - i + 1);//有几个连续的不重复的元素,并且确定最大的连续数量
            index[s.charAt(j)] = j + 1;//出现则做记录,记录是第几个元素,出现的位置
        }
        return a;
    }
}

