class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int[] oddPos = new int[n/2];
        int index = 0;
        for (int i = 1; i < n; i += 2) {
            oddPos[index++] = nums[i];
        }
        Arrays.sort(oddPos);
        int[] evenPos = new int[(n%2==1)?n/2+1:n/2];
        index = 0;
        for (int i = 0; i < n; i += 2) {
            evenPos[index++] = nums[i];
        }
        Arrays.sort(evenPos);
        int evenIndex = 0, oddIndex = oddPos.length - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = evenPos[evenIndex++];
            } else {
                nums[i] = oddPos[oddIndex--];
            }
        }
        return nums;
    }
}
