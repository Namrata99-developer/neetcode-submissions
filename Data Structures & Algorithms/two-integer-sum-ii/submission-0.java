class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp=0;
        int rp= numbers.length-1;
        int n1=0;
        int n2=0;
        while(lp<rp){
            if(numbers[lp]+numbers[rp]==target){
             n1=lp+1;
             n2=rp+1;
                break;
            }
            if(numbers[lp]+numbers[rp]<target){
                lp++;
            }else{
                rp--;
            }
        }
        return new int[]{n1,n2};
    }
}
