public class SwitchExample {
    public static void main(String[] args) {
        String monthShort = "Apr";
        String monthLong = "";
        
        switch (monthShort) {
            case "Jan": monthLong = "January"; break;
            case "Feb": monthLong = "February"; break;
            case "Apr": monthLong = "April"; break;
            default: monthLong = "Undefined";
        }

        System.out.println("Month Long: " + monthLong);
    }
}
