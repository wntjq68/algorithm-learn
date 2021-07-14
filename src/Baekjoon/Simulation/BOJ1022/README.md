# Baekjoon 1022 : 소용돌이 예쁘게 출력하기  

## Solution Logic

1. 일단 최대 r2-r1 = 50, c2-c1 = 5 이므로 표현 해줄 이차원 배열을 
[r2-r1][c2-c1] 크기로 만든다.

2. 실제 이차원 배열은 음수 인덱스를 가질 수 없으므로 r1 = 0 , c1 = 0, r2 = r2 -r1, c2 = c2 - c1으로 새롭게 초기화 해준다.

3. 1부터 두번 방향을 전환하면 나아가야할 갯수가 하나씩 늘어나는 규칙을 가지고 있다.

4. 해당 규칙을 이용해 1부터 시작해 x, y 위치가 (r1, c1),(r2, c2) 로 생기는 사각형 내에 들어오면 값을 이차원 배열에 넣어주고 숫자를 늘린 후 다음 칸으로 이동한다.

5. 만약 범위 밖이면 숫자만 늘려주고 다음 칸으로 이동한다.

6. 위 과정을 (r1,c1),(r1,c2),(r2,c1),(r2,c2) 사각형의 각 꼭지점이 0이 아니게 되는 순간 까지 반복한다. 