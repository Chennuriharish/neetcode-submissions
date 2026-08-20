class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] leftSum = new int[nums.length];
        
        int[] rightSum = new int[nums.length];

        int[] res= new int[nums.length];

        leftSum[0] = 1;
        rightSum[nums.length-1] = 1;

        for(int i=1; i<nums.length; i++) {
            leftSum[i] = leftSum[i-1] * nums[i-1]; 
        }

        for(int i=nums.length-2; i>=0; i--) {
            rightSum[i] = nums[i+1] * rightSum[i+1];
        }

        for(int i=1; i<res.length-1; i++) {
            res[i] = leftSum[i] * rightSum[i];
        }

        res[0] = rightSum[0];
        res[nums.length-1] = leftSum[nums.length-1];

        return res;

    }
}  
