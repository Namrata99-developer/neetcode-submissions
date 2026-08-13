class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null && strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,ArrayList<String>> map= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String si= strs[i];
            char[] chArray = si.toCharArray();
            Arrays.sort(chArray);
            String sortedKey= String.valueOf(chArray);
            map.putIfAbsent(sortedKey,new ArrayList<>());
            map.get(sortedKey).add(si);
        }
        return new ArrayList<>(map.values());
    }
}
