import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 100;

        String[] subject = new String[max];
        double[] credit = new double[max];
        String[] grade = new String[max];

        int index = 0;
        String line;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] parts = line.trim().split(" ");

            subject[index] = parts[0];
            credit[index] = Double.parseDouble(parts[1]); 
            grade[index] = parts[2];
            index++;
        }

        double totalScore = 0.0;
        double totalCredit = 0.0;

        for (int i = 0; i < index; i++) {
            String g = grade[i];

            if (g.equals("P")) {
                continue;
            }

            double gradePoint = 0.0;  // ← 선언 추가

            switch (g) {
                case "A+": gradePoint = 4.5; break;
                case "A0": gradePoint = 4.0; break;
                case "B+": gradePoint = 3.5; break;
                case "B0": gradePoint = 3.0; break;
                case "C+": gradePoint = 2.5; break;
                case "C0": gradePoint = 2.0; break;
                case "D+": gradePoint = 1.5; break;
                case "D0": gradePoint = 1.0; break;
                case "F":  gradePoint = 0.0; break;
                default: continue;
            }

            totalScore += credit[i] * gradePoint;
            totalCredit += credit[i];
        }

        double average = totalScore / totalCredit;
        System.out.printf("%.6f\n", average);
    }
}
