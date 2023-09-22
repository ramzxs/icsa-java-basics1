import java.util.Scanner;

public class Menus {
    public static void main(String[] args) {
        System.out.println("MENUS APP");


        // This app will display a menus
        // User will have to select an item
        // The system will display more info about the selected item
        Scanner kb = new Scanner(System.in);
        boolean exitNow = false; 

        do {
            System.out.println("\n\n\n\nFAVORITE MUSIC GENRE");
            System.out.println("A. Pop");
            System.out.println("B. Blues");
            System.out.println("C. Jazz");
            System.out.println("D. Rock");
            System.out.println("E. Hip Hop");
            System.out.println("0. Exit");
            System.out.print("Select: ");

            String choiceTemp = kb.nextLine();
            char choice = choiceTemp.charAt(0); 

            switch (choice) {
                case 'A':
                    System.out.println("\n\nTaylor Swift");
                    System.out.println("Justin Bieber");
                    System.out.println("Justin Bieber");
                    break;
                case 'B':
                    System.out.println("\n\nSelected B");
                    break;
                case 'C':
                    System.out.println("\n\nMiles Davis");
                    System.out.println("Duke Ellington");
                    System.out.println("Louis Armstrong");
                    break;
                case 'D':
                    System.out.println("\n\nD");
                    break;
                case 'E':
                    System.out.println("\nE");
                    break;
                case '0':
                    exitNow = true;
                    break;
                default:
                    System.out.println("\n\nInvalid choice");
            }
        } while (exitNow != true);

        kb.close();
    }
}
