public class MaxSubArraySumOne
{

    public static void print(int numbers[])
    {
        int ts = 0; // total subarrays
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i; j < numbers.length; j++)
            {
                int sum = 0;

                // Print opening bracket on a new line
                System.out.println("[");
                for (int k = i; k <= j; k++)
                {
                    System.out.print(numbers[k]);
                    if (k < j) System.out.print(", ");
                    sum += numbers[k];
                }
                System.out.println("] => Sum = " + sum);

                // Update maxSum if needed
                if (sum > maxSum)
                {
                    maxSum = sum;
                }

                ts++;
            }
        }

        System.out.println("Total subarrays: " + ts);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args)
    {
        int numbers[] = {2, -4, 6, 8, -1, 10};
        print(numbers);
    }
}