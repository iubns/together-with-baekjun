import java.util.Scanner;
import java.util.Arrays;

public class Main {

   
    public static boolean exists(int[] cards, int target) {
        int lo = 0;                  
        int hi = cards.length - 1;   

        while (lo <= hi) {
            int mid = (lo + hi) / 2; 

            if (cards[mid] == target) { 
                return true; 
            }
            else if (cards[mid] < target) {
                lo = mid + 1;
            }
            else {
                 hi = mid - 1;
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);

        int M = sc.nextInt();

        int[] results = new int[M]; 
        for (int i = 0; i < M; i++) {
            int q = sc.nextInt();
            if (exists(cards, q)) {
                results[i] = 1;
            } else {
                results[i] = 0;
            }
        }

        for (int i = 0; i < M; i++) {
            System.out.print(results[i] + " ");
        }

        sc.close(); 
    }
}
