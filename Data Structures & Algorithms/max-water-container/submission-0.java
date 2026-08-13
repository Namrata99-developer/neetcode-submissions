class Solution {
    public int maxArea(int[] heights) {
        int lp=0;
        int rp=heights.length-1;
        int maxWater= Integer.MIN_VALUE;
        while(lp<rp){
            int ht= Math.min(heights[lp],heights[rp]);
            int wd= rp-lp;
            int water= ht*wd;
            maxWater=Math.max(maxWater,water);
            if(heights[lp]<heights[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
}
