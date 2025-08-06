import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
	int N = 5;
        String[] A = new String[N];


        for (int i = 0; i < N; i++) {
                A[i] = scanner.nextLine();
            }
     

	int maxLen = 0;
        for (int i = 0; i < N; i++) {
		if(A[i].length() > maxLen) {
		maxLen = A[i].length();
		}
	}

	

	
        for (int j = 0; j < maxLen; j++) {
            for (int i = 0; i < N; i++) {
		if ( j < A[i].length()) {
		System.out.print(A[i].charAt(j)); 
		}
    	}
	}
}
}

