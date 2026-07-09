// Last updated: 7/9/2026, 10:15:22 AM
class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0&&n==1){
            return 1;
        }
        int[] a = new int[n+1];
        for(int[] t :trust){
            a[t[0]]--;
            a[t[1]]++;
        }
        for(int t=0;t<n+1;t++){
            if(a[t]==n-1)
            return t;
        }
        return -1;
    }
}