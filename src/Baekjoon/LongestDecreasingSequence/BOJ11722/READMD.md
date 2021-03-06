# Baekjoon 11722 : 가장 긴 감소하는 부분 수열

## Solution Logic

1. 증가하는 부분수열을 푸는 세가지 방법중 DP를 이용한 방법 사용

2. dp[i] = i번째 값을 마지막 으로 값으로 하는 감소 수열의 길이

    dp[i] = (dp[j] + 1 < dp[i] && arr[j] < arr[i]) ? dp[j] + 1 : dp[i];

3. dp[j]+1 < dp[i] : dp 배열에서 i 이전 값 중 dp[i] 와 같은 값이 있다.

4. arr[j] > arr[i] : 위 조건을 만족할 때, 기존 배열에서 감소 수열의 기본 조건을 만족한다.

5. 위 두 조건을 만족 할 때, dp 배열의 값을 변경한다. dp[j]+1 값으로 값을 변경한다.