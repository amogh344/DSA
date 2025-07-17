package Problems.Basic;

public class SumOfSquaresOfNaturals {
    static int findSquareSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(findSquareSum(n));
    }
}