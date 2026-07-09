// Last updated: 7/9/2026, 10:17:29 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        int a =s.length();
        int b = t.length();
        if(a!=b){
            return false;
        }
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        return Arrays.equals(c,d);
    }
}
