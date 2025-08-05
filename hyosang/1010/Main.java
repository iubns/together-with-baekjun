import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    // C(n, r) = n! / (r! * (n - r)!)
    public static BigInteger combination(int n, int r) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < r; i++) {
            result = result.multiply(BigInteger.valueOf(n - i));
            result = result.divide(BigInteger.valueOf(i + 1));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt(); 
            int M = sc.nextInt();
            System.out.println(combination(M, N));
        }
        sc.close();
    }
}
