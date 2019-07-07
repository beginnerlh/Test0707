/*
小明同学需要对一个长度为 N 的字符串进行处理，他需要按照要求执行若干步骤，
每个步骤都均为下面2 种操作中的一种，2 种操作如下：
TYPE 1. 从字符串结尾开始算起，将第 X 个字符之前的字符移动到字符串末尾
TYPE 2. 输出字符串索引为 X 的字符
小明尝试了很久没能完成，你可以帮他解决这个问题吗？
输入描述:
第一行，包含两个整数，字符串的长度 N 和操作次数T；
第二行为要操作的原始字符串；

之后每行都是要执行的操作类型 TYPE 和操作中 X 的值，均为整数。

输入范围：
字符串长度 N：1 <= N <= 10000
操作次数 T：1 <= T <= 10000
操作类型 TYPE：1 <= TYPE<= 2
变量 X：0 <= X < N
输出描述:
操作的执行结果

示例1
输入

6 2
xiaomi
1 2
2 0
输出
m
*/
package lianxi0707;

import java.util.*;

public class test0707{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int t = in.nextInt();
            String ss = in.nextLine();
            String str = in.nextLine();
            int[][] nums = new int[t][2];
            for(int i = 0;i<t;i++){
                nums[i][0] = in.nextInt();
                nums[i][1] = in.nextInt();
            }
            String s = str;
            for(int i = 0;i<t;i++){
                if(nums[i][0] == 1){
                    int a = nums[i][1];
                    s = s.substring(n-a)+s.substring(0,n-a);
                }else{
                    System.out.println(s.charAt(nums[i][1]));
                }
            }
        }
    }
}
