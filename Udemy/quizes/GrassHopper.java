public class GrassHopper {
    public static int findAverage(int[] nums) {
        int sum = 0;

        for (int i : nums) {
            sum += i;
        }

        return sum / nums.length;
    }

    public static void main(String[] args) {
        System.out.println(findAverage(new int[] { 1, 2, 1, 7, 1, 1, 1 }));
    }
}