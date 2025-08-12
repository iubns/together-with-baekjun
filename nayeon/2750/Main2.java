import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Insertion Sort
        for (int i = 1; i < N; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // 한 칸 뒤로 밀기
                j--;
            }
            arr[j + 1] = key; // key를 올바른 위치에 삽입
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
