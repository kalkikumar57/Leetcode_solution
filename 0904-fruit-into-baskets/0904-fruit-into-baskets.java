class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int ans=0;
        
        Map<Integer,Integer> mp=new HashMap<>();
        for(int right=0;right<fruits.length;right++){
        mp.put(fruits[right],mp.getOrDefault(fruits[right],0)+1);  //we are putting right elements in map

        while(mp.size()>2){          //until this condition is false perform while
            mp.put(fruits[left],mp.get(fruits[left])-1);    //we are shrinking means removing left elemnt and count of left element in map
            if(mp.get(fruits[left])==0){   //if count of element is 0 we remove element from map
                mp.remove(fruits[left]);
            }
            left++;             //After removing increase pointer to next Element.
        } 
        ans=Math.max(ans,right-left+1);   //We are counting max length;
        }
        return ans;
    }
}