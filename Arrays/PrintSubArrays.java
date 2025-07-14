public class PrintSubArrays {

    public static void print(int numbers[]) {
        int ts = 0; // total subarrays

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;

                // Print subarray
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    sum += numbers[k];
                    System.out.print(numbers[k]);
                    if (k < j) System.out.print(", ");
                }
                System.out.println("] => Sum = " + sum);

                ts++;
            }
        }

        System.out.println("Total subarrays: " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        print(numbers);
    }
}