## Baekjoon 15652 : N과M(12)

**논리 순서**

- DFS 완전 탐색을 이용하여 풀이
- 중복 된 수열을 제거하기 위해 탐색 전 이전 숫자를 저장 해두고 만약에 같은 수가 한번 더 나오면 탐색을 하지 않는다.
- depth 가 m 에 도달 할때 까지 탐색 후 출력
- depth를 늘려주고 해당 값을 배열에 추가
- 비 내림 차순 이기 때문에 크거나 같은(중복허용) 값만 정답 배열에 추가해준다.
- 중복을 허용하기 때문에 방문을 생각할 필요가 없음