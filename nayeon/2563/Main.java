import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int[][] ppr = new int[100][100];

	int sq = scanner.nextInt();


	for ( int s=0; s<sq; s++) {
	int x = scanner.nextInt();
	int y = scanner.nextInt();
		for (int j=y; j<y+10; j++) {
			for(int i=x; i<x+10; i++) {
				ppr[j][i] = 1;
			}
		}
	}



	
	int count = 0;

	for (int i=0; i<100; i++){
		for (int j=0; j<100; j++){
			if (ppr[i][j] == 1)
				{
				count ++;
				}
		}
	}

	System.out.println(count);
	}
}
