# Programmers

## Code Challenge Season 1 : 스타 수열

### Soulution Logic

1. 배열에서 가장 많이 등장한 수가 공통값이 되면 스타수열의 길이가 가장 길어지므로 등장한 수 순서대로 스타수열을 찾는다.

2. 공통값의 등장 횟수 * 2 <= 현재 구한 스타 수열 길이 이면 탐색을 할 필요가 없다.

3. 배열의 앞에서 부터 조회하면서 해당 조건에 대해서 다음 인덱스로 이동한다.

    - 해당 인덱스와 다음 인덱스 둘다 공통값이 아닌경우

    - 해당 인덱스와 다음 인덱스가 같을경우

4. 위 조건이 아닌경우 인덱스를 두칸 이동하고 해당 공통값에 대한 스타수열의 길이를 2 추가한다.

5. 앞에서 구한 스타수열 길이의 최댓값과 현재 공통값으로 구한 스타수열 길이 중 더 큰 것을 구한다.
