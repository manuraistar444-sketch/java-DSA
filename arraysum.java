public class arraySum {
    public static void main(String[] args) {
        int[] x = {5, 4, 3, 2, 1};
        int sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        System.out.println("Sum of the array is: " + sum);
    }
}
