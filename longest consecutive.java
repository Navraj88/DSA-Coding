longest consecutive leetcode


class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>st= new HashSet<>();
        if(nums.length==0){
            return 0;
        }
        for(int a:nums){
            st.add(a);
        }
        int res=1;
        for(int a: st){
            if(!st.contains(a-1)){
        
            
            int temp=a;
            int tcount=1;
            while(st.contains(temp+1)){
                temp++;
                tcount++;
                res=Math.max(res,tcount);
            }
            }
        }
        return res;
    }
}