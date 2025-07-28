import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            char arr[] = br.readLine().toCharArray();
            count_char(arr);
        }
    }
    public static void count_char(char arr[]) {
    int balance = 0;
    for (char c : arr) {
        if (c == '(') {
            balance++;
        } else if (c == ')') {
            balance--;
            if (balance < 0) {
                System.out.println("NO");
                return;
            }
        }
    }
    if (balance == 0) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
}
}
