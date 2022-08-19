// https://leetcode.com/problems/adding-two-negabinary-numbers

class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        if(arr1.length==1 && arr1[0]==0)
            return arr2;
        if(arr2.length==1 && arr2[0]==0)
            return arr1;
        int maxL= (arr1.length>=arr2.length)?arr1.length:arr2.length;
        int[] ans=new int[maxL];
        if(arr1.length==1 && arr2.length==1)
        {
            ans[0]= ((int)Math.pow((-2),arr1[0]) + (int)Math.pow((-2),arr2[0]));
            return ans;
        }
        //for calci
        int n1=0,n2=0,ans1=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==1)
            {
                n1=n1+ (int)Math.pow((-2),i);
            }
        }
        for(int j=0;j<arr2.length;j++)
        {
            if(arr2[j]==1)
            {
                n2=n2+ (int)Math.pow((-2),j);
            }
        }
        ans1=ans1+n1+n2;
        int k=maxL-1;
        while(ans1>0)
        {
            if(ans1%2==0)
            {
                ans[k]=0;
            }
            else
            {
                ans[k]=1;
            }
            ans1=ans1/2;
            k--;
        }
        return ans;
    }
}