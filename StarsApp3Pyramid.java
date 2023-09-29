import java.util.Scanner;

public class StarsApp3Pyramid {
    public static void main(String[] args) {
        System.out.println("STARS APP 3 - PYRAMID");

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the height of the pyramid: ");
        int num = Integer.parseInt( kb.nextLine() );
        System.out.println("\n");
        

        for (int row = 1; row <= num; row++) {
            int spaces = num - row;
            for (int col = 1; col <= spaces; col++) {
                System.out.print(" ");
            }

            int stars = 1 + ((row - 1) * 2);
            for (int col = 1; col <= stars; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        kb.close();
    }
}