## Baekjoon 9095 : 1, 2, 3 더하기

### 논리순서

 1. 1, 2, 3 을 각각 나타내는 방법은 각각 1, 2, 4 이다.

 2. 4 이상의 임의 수 N은 

    1 + (N-1)

    2 + (N-2)

    3 + (N-3)

    으로 표현 할 수 있다.

 3. 즉 (N-1), (N-2), (N-3) 을 1, 2, 3 으로 표현할 수 있는 방법을 더하면 된다.

    N=4) 1 + 2 + 4 = 7

    N=5) 2 + 4 + 7 = 13

    N=6) 4 + 7 + 13 = 24

    ...

    

