# Baekjoon 1043 : 거짓말

## Solution Logic

분리 집합을 이용한다.

merge() : 두 노드를 한 집합으로 합친다.

find() : 노드의 루트 노드를 탐색한다. 만약 두노의 find() 결과 값이 같으면 같은 집합에 있다는 것이다.

1. 파티에 모인 사람들에 정보를 이용하여 진실을 아는 사람이 한사람이라도 있다면 해당 파티에 모인사람들을 모두 merge 하여 한 집합에 넣늗다.

2. 위 과정을 BFS를 사용하여 진실을 아는 사람이 한사람 이라도 있는 모든 파티에 대해서 시행하고 새로 머지 된 사람들에 대해서 계속 반족한다.

3. 마지막으로 모든 파티에 대해서 한 사람도 진실을 아는 사람의 집합에 포함 되어 있지 않는 파티를 찾는다.
