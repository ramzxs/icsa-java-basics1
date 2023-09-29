public class MyArrays {
    public static void main(String[] args) {
        System.out.println("MY ARRAYS");

        int a;
        a = 1;
        System.out.println("A is equal to " + a);


        String[] names; // Array declaration
        names = new String[3];  // Array initialization
        names[0] = ""; // Item assignment (Array item acecess = set)
        names[1] = "";
        names[2] = "";

        // Array item access (get)
        System.out.println("First name " + names[0]);  
        System.out.println("Second name " + names[1]);
        System.out.println("Third name " + names[2]);

        System.out.println("---------------------------");


        int[] numbers; // Array declaration
        numbers = new int[4];  // Array initialization

        // Array item access (get or set)
        System.out.println("First number " + numbers[0]);  
        System.out.println("Second number " + numbers[1]);
        System.out.println("Third number " + numbers[2]);
        System.out.println("Forth number " + numbers[3]);


        System.out.println("---------------------------");


        int[] grades = new int[8]; // grades.length = 5
        grades[0] = 88;
        grades[1] = 77;
        grades[2] = 99;
        grades[3] = 90;
        grades[4] = 95;

        grades[5] = 95;
        grades[6] = 95;
        grades[7] = 95;


        // // Type casting
        // float average = (float) (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / 5;
        // System.out.println("Average: " + average);

        float average = 0;
        for (int i = 0; i < grades.length; i++){
            average += grades[i];
        }
        average = average / grades.length;
        System.out.println("Average: " + average);
    }
}
