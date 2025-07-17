import java.util.*;

public class PivotRotatedArray {

    // public static int pivotCheck(int nums[], int target) { //Linear Search
    // for (int i = 0; i < nums.length; i++) {
    // if (target == nums[i]) {
    // return i;
    // }
    // }
    // return -1;
    // }

    public static int pivotCheck(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n = s.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
        System.out.println("Enter the target value : ");
        int target = s.nextInt();

        System.out.println(pivotCheck(nums, target));
        s.close();
    }

}
