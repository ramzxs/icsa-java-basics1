import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int number = Integer.parseInt(kb.nextLine());

        int max = 10;

        System.out.println("WHILE LOOP");
        int counter = number;
        while (counter <= max) {
            System.out.println(counter + ". " + Math.random());
            counter = counter + 1;
        }


        System.out.println("\n\n------\n\n");

        System.out.println("FOR LOOP");

        // initialization; checking; updating
        for (int i = 1; i <= number; i++) {
            System.out.println(i + " " + Math.random());

            System.out.print("Continue? ");
            String choice = kb.nextLine();
            if (choice.equals("No")) {
                break;
            }
        }


        System.out.println("\n\n----------\n\n");

        for (int j = 1; j <= 10; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        kb.close();
    }
}
