class Solution {

    public String encode(List<String> strs) {

        StringBuilder res = new StringBuilder();

        for(String s: strs) {
            res.append(s.length());
            res.append('#');
            res.append(s);
        }
        
        return res.toString();

    }
    

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();

        int i=0;
        int j=0;

        while(i < str.length()) {
            while(str.charAt(j) != '#') {
                j++;
            }
            Integer length = Integer.parseInt(str.substring(i,j));

            res.add(str.substring(j+1, length+j+1));

            i=length+j+1;
            j=i;       
        }


        return res;
        

    }
}
