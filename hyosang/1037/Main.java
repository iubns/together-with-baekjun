import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] divisors = new int[count];

        for (int i = 0; i < count; i++) {
            divisors[i] = sc.nextInt();
        }

        Arrays.sort(divisors);

        int smallest = divisors[0];
        int largest = divisors[count - 1];

        int N = smallest * largest;

        System.out.println(N);
    }
}
