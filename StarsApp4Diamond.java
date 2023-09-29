import java.util.Scanner;

public class StarsApp4Diamond {
    public static void main(String[] args) {
        System.out.println("\t\tSTARS APP 4 - DIAMOND\n\n");

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the height/width of the diamond (odd): ");
        int num = Integer.parseInt( kb.nextLine() );
        // Check
        System.out.println("\n");

        int reverse = 0;
        for (int row = 0; row < num; row++) {
            if (row > (num / 2)) {
                reverse++;
            }
            int row2 = row - (reverse * 2);

            int stars = 1 + (row2 * 2);

            int spaces = (num - stars) / 2;
            for (int col = 0; col < spaces; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col < stars; col++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        kb.close();
    }
}