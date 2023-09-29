import java.util.Arrays;

public class MyArraysStat {
    public static void main(String[] args) {
        // 5,5,10,12,12,16,17,17,17,16,16,15,15,15,15,
        // 16,16,16,16,16,16,16,16,16,16,16,17,17,17,
        // 20,20,20,25, 27, 30

        int[] nums = {
            5, 5, 10, 12, 12, 16, 17, 17, 17, 16,
            16, 15, 15, 15, 15, 16, 16, 16, 16, 16,
            16, 16, 16, 16, 16, 16, 17, 17, 17, 
            20, 20, 20, 25, 27, 30, 31
        };

        System.out.println("Total items: " + nums.length);


        float mean = 0;
        for (int i = 0; i < nums.length; i++){
            mean += nums[i];
        }
        mean = mean / nums.length;
        System.out.println("Mean: " + mean);

        float median = 0;
        Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(i + ". " + nums[i]);
        // }
        // Sort
        // Find mid value(s)
        // If set odd, 1
        // If set even, average 2
        int mid = nums.length / 2;
        if (nums.length % 2 == 1) {  // 35; 35 / 2 = 17.5; 35 % 2 = 1 (17 remainder 1)
            median = nums[mid];  // 35 / 2 = 17 (18th Item)
        } else { // 36 % 2 = 0 (18 remainder 0)
            median = (nums[mid] + nums[mid + 1]) / 2;
        }
        System.out.println("Median: " + median);

        int mode = 0;
        // Using sorted array
        // Create Unique Numbers array
        int[] uniques = new int[nums.length];
        for (int i = 0; i < uniques.length; i++) {
            uniques[i] = -1;
        }

        // Create Tally array
        // Find the number with most tally count
        System.out.println("Mode: " + mode);
    }
}
