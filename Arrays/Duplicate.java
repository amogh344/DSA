import java.util.*;

public class Duplicate {

    public static boolean checkDistinct(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("enter the size of array");
        n = s.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the arrray to check");
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        if (checkDistinct(nums)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        s.close();
    }

}
