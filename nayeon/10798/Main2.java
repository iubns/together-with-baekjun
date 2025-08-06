import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] board = new char[5][15];
        int maxLen = 0;

        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < line.length(); j++) {
                board[i][j] = line.charAt(j);  
            }
            if (line.length() > maxLen) {
                maxLen = line.length();  
            }
        }


        for (int j = 0; j < maxLen; j++) {
            for (int i = 0; i < 5; i++) {
                if (board[i][j] != '\0') {  
                    System.out.print(board[i][j]);
                }
            }
        }
    }
}