class Solution {
    public int minimumPushes(String word) {
        if(word.length() <= 8){
            return word.length();
        }
        int count=0;
        Map<Integer,Integer> map =new HashMap<>();
        int assign_char=2;
        for(char ch:word.toCharArray()){
            if(assign_char > 9){
                assign_char =2;
            }
            map.put(assign_char,map.getOrDefault(assign_char,0)+1);
            count = count+map.get(assign_char);
            assign_char++;
        }
        return count;
    }
}