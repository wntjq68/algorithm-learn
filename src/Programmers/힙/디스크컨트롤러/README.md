# Programmers 
## 힙(Heap) : 디스크 컨트롤러

### 논리순서

우선순위 큐 대신 Heap 자료 구조 공부를 위해 직접 Heap 구현

1. 주어진 jobs를 모두 완료 할 때까지 반복
2. 만약 힙에 아무런 job이 없다면 바로 다음 job 실행
3. job이 존재 한다면 해당 job을 실행하여 종료 시간과 소요 시간을 더해준다.
4. jobs 중에 종료시간 전에 들어오는 job 은 힙에 모두 insert를 하여준다.
5. 모든 job이 완료 되면 총 소요 시간을 개수로 나누어 평균을 구한다.