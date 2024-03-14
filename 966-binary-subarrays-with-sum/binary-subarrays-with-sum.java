class Solution {
  public int numSubarraysWithSum(int[] nums, int goal) {
       int count = 0;
       int sum = 0;
       int[] prefixSum = new int[nums.length + 1];
       prefixSum[0] = 0;
       for (int i = 0; i < nums.length; i++) {
           prefixSum[i + 1] = prefixSum[i] + nums[i];
       }
       Map<Integer, Integer> map = new HashMap<>();
       for (int p : prefixSum) {
           count += map.getOrDefault(p, 0);
           map.put(p + goal, map.getOrDefault(p + goal, 0) + 1);
       }
       return count;
    }
}