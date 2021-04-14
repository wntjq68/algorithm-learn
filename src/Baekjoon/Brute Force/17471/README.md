# Baekjoon 17471 : 게리멘더링

## Solution Logic

1. DFS를 사용하여 모든 노드에 대해서 그룹 A의 가능한 모든 조합을 구한다.

2. 모든 노드에 대해서 그룹을 정했다면, BFS를 두번 사용하여 연결이 각 그룹내에 모든 노드 들이 연결 되어 있는 지 확인한다.

3. 만약 BFS 함수 내에서 각 그룹에 대해 두 번의 탐색이 끝났는데 visited 배열에 아직 false 인 값이 남아있다면 그룹 내에서 연결이 불가능한 노드가 존재 한다는 것이다.

4. 마지막으로 두그룹에 대해서 연결 가능한지 확인되면 각 그룹의 인구수 합을 구해 가장 차이가 적게 나는 값을 구한다.