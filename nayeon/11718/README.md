## 📍 문제 정보

- [#11718. 그대로 출력하기](https://www.acmicpc.net/problem/11718)
  <img src="https://static.solved.ac/tier_small/3.svg" width="16" height="16">

- **🏷️ 문제 유형**: 구현, 문자열

---

## 문제

> - 입력 받은 대로 출력하는 프로그램을 작성하시오.

## 입력

> - 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.


## 출력

> - 입력받은 그대로 출력한다.

## 예제 입력

> Hello
Baekjoon
Online Judge

## 예제 출력

> Hello
Baekjoon
Online Judge

---

## 📊 풀이 정보

- **⏱️ 소요 시간**: 15분
- **🔄 시도 횟수**: 4회
- **📅 풀이 날짜**: 2025-07-31

---

## 💭 풀이 과정 (ETC)

- 처음에는 Scanner를 사용하려 했지만 입력 줄 수가 많아 BufferedReader로 변경함.

- readLine()으로 한 줄 전체를 문자열로 입력받도록 설정함.

- 입력이 끝났는지 확인하려고 null 여부를 조건으로 반복문 종료함.


## 🔥 풀이 핵심:  

- BufferedReader는 Scanner보다 빠르게 입력을 처리할 수 있다.

- readLine()은 입력을 한 줄 단위로 문자열로 읽는다.

- 입력이 끝나면 readLine()은 null을 반환하므로 종료 조건에 사용한다.

- 반복문을 통해 입력을 계속 받고, null이 나오면 종료한다.

- readLine()은 예외가 발생할 수 있으므로 throws IOException이 필요하다.