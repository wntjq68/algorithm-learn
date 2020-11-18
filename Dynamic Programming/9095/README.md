## Baekjoon 9095 : 1,2,3 더하기

### 논리순서

1. dp[n] 에는 n 을 1,2,3 을 사용해 만들수 있는 방법의 수가 들어간다.
2. dp[1],dp[2],dp[3] 까지는 규칙이 적용 되지 않기 때문에 값을 직접 넣어준다.
3. dp[n](n>2) 부터는 1 + (n-1) , 2 + (n-2), 3 + (n-3)으로 나타낼 수 있다.
4. 따라서 n-1 , n-2, n-3 일 때의 방법의 수를 더하면 된다. 즉, dp[n-1]+dp[n-2]+dp[n-3]


```java
dp[1] = 1;
dp[2] = 2;
dp[3] = 4;

for (int i = 1; i <= n; i++) {
    if (dp[i] == 0) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    }
}
```