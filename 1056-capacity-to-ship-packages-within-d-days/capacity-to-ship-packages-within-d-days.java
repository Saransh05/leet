class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int l=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            l=Math.max(l,weights[i]);
            sum=sum+weights[i];
        }
        int u=sum;
        while(l<=u)
        {
            int mid=(l+u)/2;
            int d=calculate(weights,mid);
            if(d<=days)
            {
             u=mid-1;   
            }
            else 
            {
                l=mid+1;
            }
          
        }
        return l;
    }
    public int calculate(int[] weights,int sum)
    {
        int sum1=0,day=1;
        for(int j=0;j<weights.length;j++)
        {
            if(sum1+weights[j]>sum)
            {
                sum1=weights[j];
                day=day+1;
            }
            else{
                sum1=sum1+weights[j];
            }
        }
        return day;
    }
}