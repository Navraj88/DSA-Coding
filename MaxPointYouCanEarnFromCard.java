public class MaxPointYouCanEarnFromCard {
    class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int totalSum=0,n=cardPoints.length;
        int l=0,r=n-k;
        for(int i:cardPoints){
            totalSum+=i;
        }
        if(k==n){
            return totalSum;
        }

        int curSum=0;
        for(int i=0;i<n-k;i++){
            curSum+=cardPoints[i];
        }
        int ans=totalSum-curSum;
        while(r<n-1){
            curSum-=cardPoints[l];
            l++;
            r++;
            curSum+=cardPoints[r];
            int temp=totalSum-curSum;
            if(temp>ans){
                System.out.println(l);
                ans=temp;
            }
        }

        return ans;
    }
}
}
