package Baekjoon.DynamicProgramming.BOJ9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader br;
    public static int[] dp = new int[11];

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int test = 0; test < t; test++) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 1; i <= n; i++) {
                if (dp[i] == 0) {
                    dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
                }
            }
            System.out.println(dp[n]);
        }
    }
}
