class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> hMap = new HashMap<>();

        List<List<String>>res = new ArrayList<>();

        for(String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            if(!hMap.containsKey(String.valueOf(c))){
                hMap.put(String.valueOf(c), new ArrayList<String>());
            } 
            hMap.get(String.valueOf(c)).add(s);
        }

        for(String s: hMap.keySet()) {

            res.add(hMap.get(s));

        }

        return res;

    }
}
