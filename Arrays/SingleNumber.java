public class SingleNumber {
    // Function to find the single number
    public int singleNumber(int[] nums) {
        int result = 0;

        // XOR all elements in the array
        for (int num : nums) {
            result ^= num;
        }

        return result; // The unique number
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();

        int[] nums1 = { 2, 2, 1 };
        System.out.println("Output: " + sn.singleNumber(nums1)); // Output: 1

        int[] nums2 = { 4, 1, 2, 1, 2 };
        System.out.println("Output: " + sn.singleNumber(nums2)); // Output: 4

        int[] nums3 = { 1 };
        System.out.println("Output: " + sn.singleNumber(nums3)); // Output: 1
    }
}