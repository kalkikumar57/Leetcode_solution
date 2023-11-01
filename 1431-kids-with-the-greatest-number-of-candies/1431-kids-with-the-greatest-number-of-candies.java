class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> ans = new ArrayList<>(candies.length);
        int maxy = -9999999;
        for(int i=0;i<candies.length;i++){
            maxy=Math.max(maxy,candies[i]);
        }
        for(int i: candies){
            ans.add(i >= maxy - extraCandies);
        }
        return ans;
    }
}