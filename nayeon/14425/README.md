## 📍 문제 정보

- [#14425. 문자열 집합](https://www.acmicpc.net/problem/14425)
  <img src="https://static.solved.ac/tier_small/6.svg" width="16" height="16">

- **🏷️ 문제 유형**: 자료 구조, 문자열, 해시를 사용한 집합과 맵, 집합과 맵, 트리를 사용한 집합과 맵

---

## 문제

> - 총 N개의 문자열로 이루어진 집합 S가 주어진다.

입력으로 주어지는 M개의 문자열 중에서 집합 S에 포함되어 있는 것이 총 몇 개인지 구하는 프로그램을 작성하시오.

## 입력

> - 첫째 줄에 문자열의 개수 N과 M (1 ≤ N ≤ 10,000, 1 ≤ M ≤ 10,000)이 주어진다.

다음 N개의 줄에는 집합 S에 포함되어 있는 문자열들이 주어진다.

다음 M개의 줄에는 검사해야 하는 문자열들이 주어진다.

입력으로 주어지는 문자열은 알파벳 소문자로만 이루어져 있으며, 길이는 500을 넘지 않는다. 집합 S에 같은 문자열이 여러 번 주어지는 경우는 없다.


## 출력

> - 첫째 줄에 M개의 문자열 중에 총 몇 개가 집합 S에 포함되어 있는지 출력한다.

## 예제 입력

> 5 11
baekjoononlinejudge
startlink
codeplus
sundaycoding
codingsh
baekjoon
codeplus
codeminus
startlink
starlink
sundaycoding
codingsh
codinghs
sondaycoding
startrink
icerink

## 예제 출력

> 4

---

## 📊 풀이 정보

- **⏱️ 소요 시간**: 55분
- **🔄 시도 횟수**: 5회
- **📅 풀이 날짜**: 2025-08-15

---

## 💭 풀이 과정 (ETC)

- 첫 줄에서 N, M을 읽고 각각 집합 S의 문자열 개수와 검사할 문자열 개수로 저장

- N개의 문자열을 배열 S에 차례대로 저장

- S 배열을 Arrays.sort()로 오름차순 정렬

- M개의 문자열을 하나씩 읽으며 Arrays.binarySearch()로 S 배열에서 검색

- 이진탐색 결과가 0 이상이면 카운트를 1 증가

- 모든 검사 문자열을 처리한 후 카운트 값을 출력


## 🔥 풀이 핵심:  

- BufferedReader와 StringTokenizer 사용 → 대량 입력 시 속도 향상

- Arrays.sort(S) → 문자열 배열을 정렬하여 이진탐색 가능하게 준비

- Arrays.binarySearch(S, q) → O(log N) 시간에 포함 여부 확인

- 카운트 변수 count로 포함된 문자열 개수 누적

- 원래 방법: N×M 중첩 반복문으로 직접 비교했으나 O(10^8)이라 시간초과 발생

- 개선 방법: 배열만 사용하되 정렬 + 이진탐색으로 O(N log N + M log N)으로 최적화