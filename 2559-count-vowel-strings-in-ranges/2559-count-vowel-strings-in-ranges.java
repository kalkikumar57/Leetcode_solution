class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int q=queries.length;

        int[] result=new int[q];
        int[] cummSum=new int[n];

        int sum=0;
        for(int i=0;i<n;i++){
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length()-1))){
                sum++;
            }
            cummSum[i]=sum;
        }
        for(int i=0;i<q;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            if(l>0){
                result[i]=cummSum[r] - cummSum[l-1];
            }else{
                result[i]=cummSum[r];
            }
        }
        return result;
    }
    public static boolean isVowel(char ch){
        return ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}