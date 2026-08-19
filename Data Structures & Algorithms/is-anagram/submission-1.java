class Solution {
    public boolean isAnagram(String s, String t) {

        if (s == null && t == null) {
            return true;
        }

        if( s == null || t == null) {
            return false;
        }

        char[] s1 = new char[s.length()];
        s1 = s.toCharArray();

        char[] t1 = new char[t.length()];
        t1 = t.toCharArray();   

        Arrays.sort(s1);
        Arrays.sort(t1);

        if(Arrays.toString(s1).equals(Arrays.toString(t1))) {
            return true;
        } 

        return false;

    }
}
