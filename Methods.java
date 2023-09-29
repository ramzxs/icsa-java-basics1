public class Methods {
    // CLASS MEMBERS
    // Class Variables
    // Class Methods

    
    public static void main(String[] args) {
        System.out.println("METHODS APP");

        int a = 1;
        printSeparator();

        // Method Call Statement
        printAppVersion();

        printSeparator(15);

        System.out.println("Random Number: " + generateRandomNumber());
        System.out.println("Random Number: " + generateRandomNumber(4));
    }
    
    // Method Declaration
    static void printAppVersion() {
        System.out.println("Version 1.0");
    }

    static void printSeparator() {
        printSeparator(10);
    }

    static void printSeparator(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("- ");
        }
        System.out.println();
    }

    static int generateRandomNumber() {
        return generateRandomNumber(2);
    }

    static int generateRandomNumber(int digits) {
        int rn = (int) (Math.random() * Math.pow(10, digits));  // 0.0 -> 0.9999 * 100 = 99
        return rn;
    }
}
