## Baekjoon 1305 : 광고

### 논리순서
1. KMP 알고리즘의 PI 배열을 구한다.(Baekjoon 1786 참고)
   -  pi[i]는 문자열의 길이가 i 일때, 동일한 접두사와 접미사의 길이이다.
2. 만약 전광판의 길이를 L이라 하면, 사실상 필요한 정보는 pi[L]이다.
    
    ex) L = 7, s= abaabab 일때,(접두사)ab == (접미사)ab 이기 때문에 pi[L] = 2 이다.

3. 전광판 내에서 접두사와 접미사가 같다는 것은 전광판의 접미사가 다음 광고 패터의 접두사가 될 수 있다는 뜻이다.
   
3. 즉, 전광판의 길이 L 에서 (접두사와 접미사가 동일할 때) 접미사의 길이를 빼준 값이 광고의 패턴이라고 할 수 있다.
    
    ex) (전광판)abaabab - (접미사)ab = (광고패턴)abaab 