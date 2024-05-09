class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        Arrays.sort(happiness);
        long ans=0;
        int a=0;
        int c=0;
        for(int i=n-1;i>=(n-k);i--)
        {
            if(happiness[i]>=c)
            {a=happiness[i]-c;}
            else{break;}
            ans+=a;
            c++;
        }
        return ans;
    }
}