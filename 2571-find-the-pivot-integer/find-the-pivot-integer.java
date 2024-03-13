class Solution {
    public int pivotInteger(int n) {
         int totalSum = n * (n + 1) / 2;
        int pivot = (int) Math.sqrt(totalSum);

        if (pivot * pivot == totalSum) {
            return pivot;
        } else {
            return -1;
        }
    }
}