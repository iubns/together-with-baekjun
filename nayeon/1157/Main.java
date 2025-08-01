import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String word = br.readLine().toUpperCase(); //단어 입력받고 대문자로 바꿈
	char[] letter = word.toCharArray(); //입력받은 단어 들어가는 배열
	int[] count = new int[26]; //카운트에 쓸 배열
	
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	char[] al = alphabet.toCharArray(); // print에 쓸 배열
	
	for (int i=0; i < word.length(); i++) {
		for (int j = 0; j < 26; j++) {
			if (letter[i] == al[j]) {
			count[j]++;
			}
		}
    }
        int max = -1;
        char result = '?';

        for (int i1 = 0; i1 < 26; i1++) {
            if (count[i1] > max) {
                max = count[i1];
                result = al[i1];
            } else if (count[i1] == max) {
                result = '?';  // 같은 수가 있으면 ? 출력
            }
        }
       
        System.out.print(result);
	
   }
}