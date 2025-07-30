import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) break;
            isPrime(input);
        }
    }

    public static void isPrime(int input) {
        boolean[] prime_set = new boolean[2 * input + 1];
        Arrays.fill(prime_set, true);
        prime_set[0] = prime_set[1] = false;

        for (int i = 2; i * i <= 2 * input; i++) {
            if (prime_set[i]) {
                for (int j = i * i; j <= 2 * input; j += i) {
                    prime_set[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = input + 1; i <= 2 * input; i++) {
            if (prime_set[i]) count++;
        }

        System.out.println(count);
    }
}
