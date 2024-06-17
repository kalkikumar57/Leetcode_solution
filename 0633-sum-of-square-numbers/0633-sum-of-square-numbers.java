class Solution {
    public boolean judgeSquareSum(int c) {
     for(int div = 2;div *div <= c;div++){
         if(c % div ==0){
             int count=0;
             while(c%div == 0){
                 count++;
                 c = c/div;
             }
             if(div % 4 == 3 && count % 2 !=0)
                 return false;
         }
     }
        return c%4 != 3;
    }
}