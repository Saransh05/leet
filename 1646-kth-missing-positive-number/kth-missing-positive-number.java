class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i,j=1,ans=0;
        int n=arr.length;
        for(i=0;i<n;i++)
        {
            if(arr[i]==j)
            {
                j++;
                
            }
            else if(arr[i]!=j){
                j++;
                ans++;
                i--;
            }
            if(ans==k)
            {
               return j-1;
            }
        }
        if(ans<k)
        {
            return arr[n-1]+(k-ans);
        }
    
        return 0;
    }
}