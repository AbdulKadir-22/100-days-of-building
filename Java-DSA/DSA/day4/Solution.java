public class Solution {
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 1, 2, 2, 3, 4, 4 };
        int k = removeDuplicates(nums);

        System.out.println("The number of unique elements is: " + k);

        System.out.print("The modified array is: [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i == k - 1 ? "" : ", "));
        }
        System.out.println("]");
    }

}