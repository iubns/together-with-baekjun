import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String word = sc.nextLine().trim();     
        char[] arr = word.toCharArray();
  
        if (word.isEmpty()) {
            System.out.println(0);  
            return;
        }

        int n = 0;
        for (int i=0; i < arr.length; i++) {
        if (arr[i] == ' ') {
        n++;
        }
        }

        System.out.println(n+1);       
    }
}