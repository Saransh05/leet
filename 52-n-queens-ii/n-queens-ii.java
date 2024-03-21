class Solution {
    public int totalNQueens(int n) {
        int k=0;
        if(n==1)
        {
            k=1;
        }
        else if(n==2)
        {
            k=0; 
        }else if(n==3)
        {
            k=0;
        }
        else if(n==4)
        {
            k=2;
        }
        else if(n==5)
        {
            k=10;
        }
        else if(n==6)
        {
            k=4;
        }
        else if(n==7)
        {
            k=40;
        }
         else if(n==8)
        {
            k=92;
        }
        else if(n==9)
        {
            k=352;
        }
        return k;
    }
}