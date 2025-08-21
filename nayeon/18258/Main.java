import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] q = new int[N];
        int head = 0; 
        int tail = 0; 

        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();

            if (cmd.startsWith("push")) {
                int x = Integer.parseInt(cmd.substring(5));
                q[tail++] = x; 
            } else if (cmd.equals("pop")) {
                if (head == tail) {
                    out.append(-1).append('\n'); 
                } else {
                    out.append(q[head++]).append('\n'); 
                }
            } else if (cmd.equals("size")) {
                out.append(tail - head).append('\n');
            } else if (cmd.equals("empty")) {
                out.append(head == tail ? 1 : 0).append('\n');
            } else if (cmd.equals("front")) {
                if (head == tail) {
                    out.append(-1).append('\n');
                } else {
                    out.append(q[head]).append('\n');
                }
            } else if (cmd.equals("back")) {
                if (head == tail) {
                    out.append(-1).append('\n');
                } else {
                    out.append(q[tail - 1]).append('\n');
                }
            }
            
        }

        System.out.print(out.toString());
    }
}
