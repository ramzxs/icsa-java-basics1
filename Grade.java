import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("GRADE APP");

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter grade (0-100): ");
        int grade = Integer.parseInt( kb.nextLine() );

        // 97–100       A+
        // 93–96        A
        // 90–92        A-
        // 87–89        B+
        // 83–86        B
        // 80–82        B-
        // 77–79        C+
        // 73–76        C
        // 70–72        C-
        // 67–69        D+
        // 65–66        D
        // below 65     D-

        /* PSEUDOCODE
        if grade >= 97 but not more than 100
            gradeLabel = "A+"
        elseif grade >= 93 but not more than 96
            gradeLabel = "A"
        .
        .
        .
        else
            gradeLabel = "Invalid" */

        // LOGIC
        String gradeLabel = "";
        
        if (grade >= 97 && grade <= 100) {
            gradeLabel = "A+";
        } else if (grade >= 93 && grade <= 96) {
            gradeLabel = "A";
        } else if (grade >= 90 && grade <= 92) {
            gradeLabel = "A-";
        } else if (grade >= 87 && grade <= 89) {
            gradeLabel = "B+";
        } else if (grade >= 83 && grade <= 86) {
            gradeLabel = "B";
        } else if (grade >= 80 && grade <= 82) {
            gradeLabel = "B-";
        } else if (grade >= 77 && grade <= 79) {
            gradeLabel = "C+";
        } else if (grade >= 73 && grade <= 76) {
            gradeLabel = "C";
        } else if (grade >= 70 && grade <= 72) {
            gradeLabel = "C-";
        } else if (grade >= 67 && grade <= 69) {
            gradeLabel = "D+";
        } else if (grade >= 65 && grade <= 66) {
            gradeLabel = "D";
        } else if (grade >= 0 && grade <= 64) {
            gradeLabel = "D-";
        } else {
            gradeLabel = "Invalid";
        }
        

        System.out.println("The grade " + grade + " is " + gradeLabel + ".");
    }
}
