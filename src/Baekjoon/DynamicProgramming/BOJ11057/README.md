## Baekjoon 11057 : 오르막수

### 논리순서

| N/L | 0   | 1   | 2   | 3   |
| --- | --- | --- | --- | --- |
| 1   | 1   | 1   | 1   | 1   |
| 2   | 10  | 9   | 8   | 7   |
| 3   | 55  | 45  | 36  | 28  |
---

1. N 은 자릿 수이고 L은 맨앞에 오는 숫자이다. L 은 0~ 9 사이의 수가 올 수 있다.

2. 행렬의 i 행 j 열 에는 i-1 행의 j 열 부터의 숫자를 다 더한 값이 나온다. 
3. 즉 **mat[i][j] = mat[i-1][j]+mat[i-1][j+1] ... mat[i][9]**

```java
 for (int i = 1; i < n; i++) {
	int start = 0;
	mat[i][0] = start;
	for (int j = 0; j < 10; j++) {
		for (int k = j; k < 10; k++) {
			mat[i][j] += mat[i - 1][k];
		}
	mat[i][j] %= 10007;
	}
}
```


