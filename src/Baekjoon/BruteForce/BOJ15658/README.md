## Baekjoon 15658 : 연산자끼워넣기(2)

### 논리순서

 1. DFS 알고리즘을 이용

 2. dfs() 의 인자로 깊이, 현재까지의 결과, 사용한 연산자 를 준다

 3. 깊이가 숫자의 갯수 만큼 안가고 사용할 연산자가 남아 있으면 +, -, * , / 를 다 실행한 후 사용한 연산자를 더 해주고 각각의 결과 값을 깊이를 하나씩 더해 dfs의 인자로 넘겨 준다.

 4. 깊이가 숫자의 갯수에 도달하면 그때의 결과 값과 현재까지의 최댓값, 최솟값과 비교해본다.

    