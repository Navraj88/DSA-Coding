public class TrappingRainWater {
    public int trap(int[] height) {
        int n=height.length;

        int []lrow = new int[n];
        int []rrow = new int[n];

        lrow[0]=height[0];
        rrow[n-1]=height[n-1];

        for(int i=1;i<n;i++){
            lrow[i]=Math.max(lrow[i-1],height[i]);
        }

        for(int i=n-2;i>=0;i--){
            rrow[i]=Math.max(rrow[i+1],height[i]);
        }

        int waterTrap=0;

        for(int i=0;i<n;i++){
            int m=Math.min(rrow[i],lrow[i]);
            waterTrap+=m-height[i];
        }
        return waterTrap;
    }
}
