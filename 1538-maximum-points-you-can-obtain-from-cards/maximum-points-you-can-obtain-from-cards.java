class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int tot=0;
        int n=cardPoints.length;
        int sum=0;
        int i=0;
        int l=0;
        int maxi=0;
        for(int j=0;j<n;j++)
        {
            tot+=cardPoints[j];
        }
        if(k==n) return tot;
        while(l<n)
        {
            sum=sum+cardPoints[l];
            if((l-i)==(n-k-1))
            {
                maxi=Math.max(maxi,tot-sum);
                sum=sum-cardPoints[i];
                i++;
            }
            l++;
        }
        return maxi;
    }
}