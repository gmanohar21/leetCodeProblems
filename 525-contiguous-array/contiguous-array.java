class Solution {
    public int findMaxLength(int[] nums) {
        int ret = 0;
        int count = 0;
        int numsSize = nums.length;
        int[] arr = new int[numsSize * 2 + 1];
        Arrays.fill(arr, -2);
        arr[numsSize] = -1;
        for (int i = 0; i < numsSize; i++) {
            count += nums[i] == 0 ? -1 : 1;
            if (arr[count + numsSize] >= -1) {
                if (ret < (i - arr[count + numsSize])) {
                    ret = i - arr[count + numsSize];
                }
            } else {
                arr[count + numsSize] = i;
            }
        }
        return ret;
    }
}