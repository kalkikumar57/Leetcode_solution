public class Solution{
    public int maxScore(String s){
        int n=s.length();
        int score =Integer.MIN_VALUE;
        int zeros=0;
        int ones=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i) == '1'){
                ones++;
            }else{
                zeros++;
            }
            score = Math.max(score , zeros-ones);
        }
        if(s.charAt(n-1) == '1'){
            ones++;
        }
        return score+ones;
    }
}





















// Brute
// class Solution {
//     public int maxScore(String s) {
//         int n=s.length();
//         int result=Integer.MIN_VALUE;
//         for(int i=0;i<n-1;i++){
//             int zerosLeft = 0;
//         for(int j=0;j<=i;j++){
//             if(s.charAt(j) == '0'){
//             zerosLeft++;
//         }
//         }
//             int oneRight=0;
//             for(int j=i+1;j<n;j++){
//                 if(s.charAt(j) == '1'){
//                     oneRight++;
//                 }
//             }
//             result=Math.max(result , zerosLeft+oneRight);
//         }
//         return result;
//     }
// }