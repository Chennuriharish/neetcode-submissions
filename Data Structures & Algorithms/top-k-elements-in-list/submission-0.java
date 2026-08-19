class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] res = new int[k];

        Map<Integer, Integer> hMap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {

            if(!hMap.containsKey(nums[i])){
                hMap.put(nums[i], 1);
            } else {
                hMap.put(nums[i], hMap.get(nums[i])+1);
            }
        }

        Queue<Integer> pq = new PriorityQueue<>((a,b)-> hMap.get(a)-hMap.get(b));
        for(int i: hMap.keySet()) {
            pq.add(i);
            if(pq.size() > k){
                pq.poll();
            }
        }

        for(int i=0; i<k; i++) {
            res[i] = pq.poll();
        }

        return res;

    }
}
