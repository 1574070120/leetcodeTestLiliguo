package com.liliguo.string.test.code;

/**
 * @Author:liliguo
 * @Description:
 * @Date:Created in 1:30 下午 2020/5/13
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(new Main2().baseNeg2_2(6));
    }

    public String baseNeg2(int N) {
        if (N == 0) return "0";
        if (N == 1) return "1";

        StringBuilder ans = new StringBuilder();
        while (true) {
            if (N == 0) {
                break;
            }

            ans.append(Math.abs(N % 2));

            if(N > 0){
                N /=-2;
            }else{
                double d = Math.ceil(N/(double)-2);
                N = (int)d;
            }
        }
        return ans.reverse().toString();
    }

    public String baseNeg2_2(int N){
        if(N == 0){
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(N != 0){
            if(N%2 == 0){
                stringBuilder.append("0");
                N /= -2;
            }else{
                stringBuilder.append("1");
                N = (N-1)/-2;
            }
        }
        return stringBuilder.reverse().toString();
    }
}
