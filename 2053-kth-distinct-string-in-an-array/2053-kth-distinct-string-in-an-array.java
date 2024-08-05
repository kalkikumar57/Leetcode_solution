class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> Distinct = new HashMap<>();
        for(String str: arr){
            Distinct.put(str,Distinct.getOrDefault(str,0)+1);
        }
        for(String str:arr){
            if(Distinct.get(str) == 1){
                k--;
            }
            if(k==0){
                return str;
            }
        }
        return "";
    }
}