import java.util.Scanner;

public class StarsApp2 {
    public static void main(String[] args) {
        System.out.println("STARS APP 2");

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Integer.parseInt( kb.nextLine() );

        System.out.println("\n");
        

        for (int row = num; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*"); 
            }
            System.out.println();
        }


        kb.close();
    }
}
