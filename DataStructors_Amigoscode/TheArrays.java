import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "pink";
        colors[1] = "purple";
        System.out.println(Arrays.toString(colors));


        int[] nums = {0, 1, 2, 3, 4};
        nums[3] = -5;
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.stream(colors).distinct().count());

        for (int num : nums) {
            System.out.print((num % 2) + ", ");
        }




    }
}