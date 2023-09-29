import java.util.Scanner;

public class StarsApp1 {
    public static void main(String[] args) {
        System.out.println("STARS APP 1");

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Integer.parseInt( kb.nextLine() );

        System.out.println("\n");
        

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.print("\n");  // System.out.println();       
        }


        kb.close();
    }
}
