# Baekjoon 6503 : 망가진 키보드

## Solution Logic

1. 투포인터를 활용하여 풀이.

2. map을 이용하여 현재 추가된 문자의 개수를 구한다.

3. pointer 1(i) = 문자열 앞에서 부터 map에서 제거할 문자의 위치

4. pointer 2(j) = 앞으로 map에 추가할 문자의 위치

5. 만약 map.size()가 주어진 n 보다 작거나 같고 j 가 문자열의 길이보다 작으면 문자를 추가할지를 확인한다.

6. 만약 map.size()가 n보다 작으면 j 에 해당하는 문자를 map에 추가 또는 원래 value를 1 증가 해주고 j++한다.

7. 만약 map.size()가 n과 같으면 j 에 해당하는 문자가 이미 map에 존재할시에만 value를 1증가 해주고 아닐경우에는 break한다.

8. 5,6,7 과정의 반복이 종료되면 현재 map의 value들을 sum해준다.

9. 마지막으로 앞에있는 문자에 해당하는 key 값의 value를 map에서 1감소 시켜주고, 만약 0이 되었다면 해당 문자를 삭제한다.