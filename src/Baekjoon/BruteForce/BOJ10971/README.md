## Baekjoon 10971 : 외판원 순회

### 논리순서

 1. DFS 를 활용, 각 지역을 노드로 둠
 2. 부모 노드에서 자식 노드로 갈 때 방문 했는지와 가는 길이 있는지(!=0)를 체크하고 그때마다 비용을 더하고 방문을 체크하면서 내려간다.
 3. 지역의 갯수 만큼 depth를 내려가서 마지막에는 처음 노드로 가는 길이 있는지 확인하여 있으면 그 비용을 더해준다
 4. 마지막으로 처음 노드로 돌아 가는 길이 있다면 그때의 비용을 더한 값과 현재까지의 최솟 값을 비교하여 최솟값을 구한다.
 5. 모든 탐색을 마치면 최솟값을 출력한다.

    


