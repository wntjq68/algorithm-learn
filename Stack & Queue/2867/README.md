

## Baekjoon 2867 : 수열의 값

### 논리의 순서

1. 수열의 원소의 개수 N을 입력 받는 순간 부분 수열의 개수는 정해진다.

   

2. 각각의 원소별로 부분 수열에서 최댓값과 최솟값인 횟수를 각각 구한다.

   현재 i번째(1<= i <= N) 원소를 보고 있다고 하면,  **A <= seq[i] <= B**  범위에서 seq[i]가 최대또는 최소가 될수 있는 a 와 b의 인덱스를 찾아야한다. 

   그렇다면 a <= p <=i  범위의 임의의 인덱스 p, i <= q <=b 범위의 임의의 인덱스 q 를 선택했을때 P <= seq[i] <= Q 에서도 seq[i] 가 최대 또는 최소를 만족하게 된다. 

   그런 경우의 수를 구하기 위해 (i - a + 1) * (b - i + 1)  을 해보면 i 번째 인덱스가 부분수열들에서 몇회 최대 또는 최소인지 구할 수 있다.(a와 b 는 인덱스, 각각 대응 하는 값이 A 와 B)

   - a 와 b 를 찾는 과정 : Stack 활용 , 첨부된 코드 확인

   

3. 각 원소별로 최대, 최소 횟수를 구했다면 각각의 원소와 해당하는 최대횟수는 곱해서 전체에 더해주고 최소횟수는 곱해서 전체에서 빼준다 식으로 나타내면 아래 그림과 같다.

   ![img](file:////Users/seob_jj/Library/Group%20Containers/UBF8T346G9.Office/TemporaryItems/msohtmlclip/clip_image002.png)

   

 **Stack & Queue 이외 사용한 것**

### Pair

>JAVA에는 사실 기본적으로 pair 가 없어서 직접 만들어 썻다. pair는 항상 유용하니 숙지하자
>
>Get Started 
>
>```java
>static class pair {
>        Integer key;
>        Integer value;
>
>        public pair(Integer key, Integer value) {
>            this.key = key;
>            this.value = value;
>        }
>
>        public Integer getKey() {
>            return key;
>        }
>
>        public Integer getValue() {
>            return value;
>        }
>    }
>```
>



**참고** 

사실 이 문제는 기본적으로는 시간복잡도 n^3 을 갖는다. 하지만 이러한 방식으로 시간복잡도 n으로 단축 시킬수 있다. 아무 생각없이 n^3 으로 백준에 제출하면 시간 초과가 뜬다. 그러기 위해서 백준에선 인풋하는 숫자의 범위를 엄청 넓게 설정 해뒀는데,  java의 long type가지곤 커버가 되지 않아, c++ 로 고친 후 ll (long long)을 쓰는 수고스러움을 부담 해버렸다. (실제로 정답자 코드들 중에 JAVA는 단 하나도 존재 하지 않았다)