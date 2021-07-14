

## Baekjoon 1406 : 에디터

### 논리의 순서

커서의 위치를 기준으로 왼쪽 과 오른쪽 Stack 을 각각 생성한다.

1. P $

   왼쪽 스택에 $에 해당하는 값을 push() 한다.

2. B

   왼쪽 스택이 비어 있지 않다면 왼쪽 스택의 맨위를 pop()해준다.

3. L

   왼쪽 스택이 비어 있지 않다면 왼쪽 스택의 맨위를 pop()해서 오른쪽 스택에 push() 해준다.

4. D

   오른쪽 스택이 비어 있지 않다면 오른쪽 스택의 맨위를 pop()해서 왼쪽 스택에 push() 해준다.

출력 : 왼쪽 스택을 맨위부터 차례로 오른쪽 스택에 push()해준 후 오른쪽 스택의 

​		맨위부터 차례로 출력한다.



