import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 9;
        int M = 9;

        int[][] A = new int[N][M];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
	
	    int max = -1;
	    int a = 0;
        int b = 0;


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int num = A[i][j];
		            if ( num > max) {
		                max = num;
		                a = i;
		                b = j;
		                }
            }
        }


        System.out.println(max);
		System.out.println((a+1) + " " + (b+1));
    }
}