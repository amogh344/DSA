import java.util.Arrays;

public class MergeSortedArrays {

    // Function to merge nums2 into nums1
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Step 1: Copy elements from nums2 into the extra space in nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        // Step 2: Sort the entire nums1 array (now contains m+n elements)
        for (int i = 0; i < m + n - 1; i++) {
            for (int j = 0; j < m + n - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println("Merged array: " + Arrays.toString(nums1));

        // You can add more test cases if needed
    }
}
