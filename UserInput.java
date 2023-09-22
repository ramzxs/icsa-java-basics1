import java.util.Scanner;

public class UserInput {
        public static void main(String[] args) {
            System.out.println("USER INPUT APP");

            /* INPUTS */

            String name;      // Strict data typing
            int age;          // Variable declaration
            char sex;   // Declaration & initialization Statement
            String location;

            Scanner kb = new Scanner(System.in);  // OOP

            System.out.print("Name: ");
            name = kb.nextLine();

            System.out.print("Age: ");
            age = Integer.parseInt(kb.nextLine());

            System.out.print("Sex/Gender (M or F): ");
            String temp = kb.nextLine(); // = LGBTQ+
            sex = temp.charAt(0); // 'M' != "M"; M = Male; F = Female

            System.out.print("Location: ");
            location = kb.nextLine();

            /* OUTPUTS */

            System.out.println("Hello, " + name + "!");
            System.out.println("You are " + age + " years old.");
            
            // Branchine, Conditional Statements

            // Version 1
            // String sexLong = "";
            // if (sex == 'M') { // Boolean expression = true or false
            //     sexLong = "Male";
            // } else {
            //     sexLong = "Female";
            // }

            // Version 2
            // String sexLong = "Male";
            // if (sex == 'F') {
            //     sexLong = "Female";
            // }

            // Version 3
            // Ternary Operator ?:
            // (conditionalExpressionHere) ? truePartHere : falsePartHere
            String sexLong = (sex == 'F') ? "Female" : "Male";
            
            System.out.println("You're sex/gender is " + sexLong + ".");
            
            System.out.println("How's the weather in " + location + " today?");

            kb.close();
        }
}