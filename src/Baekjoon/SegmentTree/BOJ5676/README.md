## Baekjoon 5676 : 음주코딩

### 논리순서

1. 이 문제 부분 곱을 구하는 문제로 **Segment Tree** 를 사용하였다.
2. Segment Tree 의 (초기화), (부분 연산), (값 변경) 로직을 그대로 사용하면 된다. 
3. 결국은 곱셈의 부호만 묻는 문제이므로 아래와 같이 값대신 넣어 주었다.
    - 양수 : +1
    - 음수 : -1
    - 0 : 0 
