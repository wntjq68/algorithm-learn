# Baekjoon 1629 : 곱셈

## Solution Logic

Divide & Concuer 을 이용한 거듭 제곱 계산.

1. 재귀를 이용하여 Divide & Concuer 알고리즘을 구현한다.

2. a^2b -> a^b * a^b 로 나타낼수 있는 특성을 사용하여 a^b를 재귀를 이용하여 구한다.

3. 재귀를 이용하여 a^b 를 구하면 두 수를 곱해준다.

4. 만약 지수가 홀수인 경우 a^(2b+1) 위 과정과 마찬가지로 재귀를 이용해 a^b를 구해 곱한후 a를 한번 더 곱해준다.
