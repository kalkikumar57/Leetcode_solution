class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> map = new HashSet<>();
        for(int num:nums1){
            map.add(num);
        }
        Set<Integer> store = new HashSet<>();
        for(int num:nums2){
            if(map.contains(num)){
                store.add(num);
            }
        }
        int[] result = new int[store.size()];
        int index=0;
        for(int num:store){
            result[index++]=num;
        }
        return result;
    }
}