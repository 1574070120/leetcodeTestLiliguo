package com.liliguo.string.test.code;

/**
 * @Author:liliguo
 * @Description:
 * @Date:Created in 1:10 下午 2020/5/13
 * 问题描述：1016.子串能表示从1到N数字的二进制子串
 */
public class Main1 {

    public static void main(String[] args) {
        System.out.println(new Main1().queryString("0110",3));
    }

    public boolean queryString(String S, int N) {
        for (int i = 1; i <= N; i++) {
            if(!S.contains(Integer.toBinaryString(i))){
                return false;
            }
        }
        return true;
    }

}
