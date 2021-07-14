##  Baekjoon 1759 : 암호 만들기
### 논리순서
1. DFS 완전 탐색을 사용
2. C 개의 문자를 정렬하고 아스키 코드로 변환하여 배열에 담는다.
3. 배열에 문자를 담으면서 모음과 자음 갯수를 체크 한다.
4. 깊이가 L 이 되면 모음이 하나이상 자음이 두개 이상인지 체크한다
5. 만약 조건을 만족하면 그때의 배열에 들어 있는 아스키 코드를 알파벳으로 전환해 출력 해준다.