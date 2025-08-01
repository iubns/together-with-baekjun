## 📍 문제 정보

- [#1157. 단어공부](https://www.acmicpc.net/problem/1157)
  <img src="https://static.solved.ac/tier_small/1.svg" width="16" height="16">

- **🏷️ 문제 유형**: 구현, 문자열

---

## 문제

> - 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

## 입력

> - 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

## 출력

> - 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

## 예제 입력

> Mississipi
> zZa

## 예제 출력

> ?
> Z

---

## 📊 풀이 정보

- **⏱️ 소요 시간**: 40분
- **🔄 시도 횟수**: 3회
- **📅 풀이 날짜**: 2025-08-01

---

## 💭 풀이 과정 (ETC)

- BufferedReader로 단어를 입력받고, toUpperCase()로 대문자로 변환함

- String word를 char[] letter 배열로 바꿔서 문자 하나씩 저장함 (toCharArray() 사용)

- 알파벳 비교용으로 "ABCDEFGHIJKLMNOPQRSTUVWXYZ"를 char[] al 배열에 넣음

- 알파벳 개수를 세기 위한 int[] count = new int[26] 배열 생성

- 이중 반복문으로, letter[i] == al[j]인 경우 count[j]++로 알파벳 빈도 누적

- count[] 배열에서 최대값을 찾아 가장 많이 나온 알파벳을 저장함

- 최대값이 중복되면 result를 ?로 설정


## 🔥 풀이 핵심:  

- char는 문자 하나만 저장 가능하며, "A"는 String, 'A'는 char이므로 비교 시 혼동 주의

- String 비교는 == 대신 .equals() 사용, char는 == 비교 가능

- char[]와 String[]은 다르며, char[]는 ==로 비교 가능하지만 String[]는 안 됨

- 알파벳 빈도는 count[ch - 'A']++처럼 ASCII 연산으로 해도 되지만, 여기선 직접 al[]과 비교해서 증가

- 문법 오류 주의: char는 .charAt()이 있지만 .split()이나 .equals()는 String에만 적용됨

