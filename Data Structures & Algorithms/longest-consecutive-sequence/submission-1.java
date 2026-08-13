class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max= Integer.MIN_VALUE;
        for(int num : map.keySet()){
            if(!map.containsKey(num-1)){
                int currnum=num;
                int curr=1;
            while(map.containsKey(currnum+1)){
                currnum+=1;
                curr+=1;
            }
            max=Math.max(max,curr);
            }
        }
        return max;
    }
}
