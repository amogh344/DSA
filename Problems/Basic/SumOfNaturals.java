package Problems.Basic;

public class SumOfNaturals {

    static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findSum(n));
    }
}
