import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int N = Integer.parseInt(br.readLine());
StringTokenizer st = new StringTokenizer(br.readLine(), " ");

int[] arr = new int[N];
int index = 0;
while (st.hasMoreTokens()) {
    arr[index++] = Integer.parseInt(st.nextToken());
}

Arrays.sort(arr);
System.out.print(arr[0] + " " + arr[N - 1]);
}
}