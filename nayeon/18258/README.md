## 📍 문제 정보

- [#18258. 큐 2](https://www.acmicpc.net/problem/18258)
  <img src="https://static.solved.ac/tier_small/6.svg" width="16" height="16">

- **🏷️ 문제 유형**: 자료 구조, 큐

---

## 문제

> - 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여섯 가지이다.

push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

## 입력

> - 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 2,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

## 출력

> - 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

## 예제 입력

> 15
push 1
push 2
front
back
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
front

## 예제 출력

> 1
2
2
0
1
2
-1
0
1
-1
0
3

---

## 📊 풀이 정보

- **⏱️ 소요 시간**: 81분
- **🔄 시도 횟수**: 3회
- **📅 풀이 날짜**: 2025-08-22

---

## 💭 풀이 과정 (ETC)

- 첫 줄에서 정수 N을 읽어, 처리해야 할 명령 개수로 저장

- 크기 N의 정수 배열 q 준비(최대 push 횟수 ≤ N)

- 큐 포인터 초기화: head = 0(맨 앞 요소 위치), tail = 0(다음에 넣을 자리)

- N번 반복하며 한 줄씩 명령 cmd를 읽음

- cmd.startsWith("push")면

 "push " 뒤 숫자를 cmd.substring(5)로 잘라 int x로 변환

 q[tail++] = x 로 뒤에 삽입

- cmd.equals("pop")면

 비었으면(head == tail) -1를 out에 추가

 아니면 q[head++]를 out에 추가(맨 앞을 꺼내며 head 한 칸 전진)

- cmd.equals("size")면 (tail - head)를 out에 추가

- cmd.equals("empty")면 비었으면 1, 아니면 0을 out에 추가

- cmd.equals("front")면 비었으면 -1, 아니면 q[head]를 out에 추가

- cmd.equals("back")면 비었으면 -1, 아니면 q[tail - 1]를 out에 추가

- 모든 명령 처리 후, StringBuilder out에 모아둔 내용을 한 번에 System.out.print(...)로 출력


## 🔥 풀이 핵심:  

- 배열로 직접 큐 구현:

- push: q[tail++] = x

- pop: head == tail ? -1 : q[head++]

- size: tail - head

- empty: head == tail ? 1 : 0

- front: head == tail ? -1 : q[head]

- back: head == tail ? -1 : q[tail - 1]

- head/tail 포인터만 움직여 O(1)에 모든 연산 처리 → 전체 시간 O(N)

- 입출력 최적화: BufferedReader로 입력, StringBuilder.append(...)로 출력 누적 후 한 번에 출력 (I/O 병목 제거)

- 문자열 판별: startsWith("push")로 앞부분만 확인(숫자 붙는 명령), 나머지는 equals(...)로 정확히 일치 검사

- 메모리 안전성: 최대 push 횟수가 N이므로 배열 크기 N이면 충분(원형 큐 불필요)

- 예외 처리(빈 큐): pop/front/back에서 head == tail일 때 -1 출력 규칙 준수