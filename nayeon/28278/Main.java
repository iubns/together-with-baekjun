import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int[] stack = new int[N];
        int top = -1;

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            char c = line.charAt(0);
            if (c == '1') { 
                int x = Integer.parseInt(line.substring(2)); // 공백 뒤부터 끝까지
                stack[++top] = x;
            } else if (c == '2') { 
                if (top == -1) out.append(-1).append('\n');
                else out.append(stack[top--]).append('\n');
            } else if (c == '3') { 
                out.append(top + 1).append('\n');
            } else if (c == '4') { 
                out.append(top == -1 ? 1 : 0).append('\n');
            } else if (c == '5') { 
                if (top == -1) out.append(-1).append('\n');
                else out.append(stack[top]).append('\n');
            }
        }
        System.out.print(out);
    }
}
