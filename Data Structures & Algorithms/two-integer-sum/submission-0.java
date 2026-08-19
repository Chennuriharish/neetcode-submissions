class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hMap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int req= target-nums[i];
            if(hMap.containsKey(req)) {
                return new int[]{hMap.get(req), i};
            } else {
                hMap.put(nums[i], i);
            }
        }

        return new int[]{0,0};
        
    }
}
