import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    static class IntStack {
        int[] data;  
        int top;     

        IntStack(int capacity) {
            data = new int[capacity];
            top = 0;
        }

        void push(int x) {
            data[top] = x; 
            top++;         
        }

        void pop() {
            if (top > 0) {
                top--;    
            }
        }

        long sum() {
            long s = 0;
            for (int i = 0; i < top; i++) {
                s += data[i]; 
            }
            return s;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine().trim()); 
        IntStack st = new IntStack(k);

        for (int i = 0; i < k; i++) {
            int x = Integer.parseInt(br.readLine().trim()); 
            if (x == 0) st.pop();   
            else st.push(x);       
        }

        System.out.println(st.sum()); 
    }
}
