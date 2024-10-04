class Solution {
    public long dividePlayers(int[] skill) {
         Arrays.sort(skill);
        int n=skill.length;
        int i=0;
        int j=n-1;
        int sum=skill[i]+skill[j];
        long  chem=0;
        while(i<j){
            if(skill[i]+skill[j] != sum){
                return -1;
            }
            
                chem += (long)skill[i]*(long)skill[j];
            i++;
            j--;
        }
        return chem;
    }
}