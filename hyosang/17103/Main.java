import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        int[] nums = new int[T];
        int maxN = 0;

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            nums[i] = n;
            if (n > maxN) maxN = n;
        }

        boolean[] isPrime = sieve(maxN);

        for (int n : nums) {
            int count = 0;
            for (int p = 2; p * 2 <= n; p++) { 
                if (isPrime[p] && isPrime[n - p]) count++;
            }
            sb.append(count).append('\n');
        }

        System.out.print(sb.toString());
    }

    private static boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        if (n >= 0) prime[0] = false;
        if (n >= 1) prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) continue;
            for (int j = i * i; j <= n; j += i) {
                prime[j] = false;
            }
        }
        return prime;
    }
}
