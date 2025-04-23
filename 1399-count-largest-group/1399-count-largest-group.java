class Solution {
    public int findDigitSum(int n){
        int sum=0;
        while(n > 0){
        sum += n%10;
        n /= 10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        HashMap<Integer , Integer> mp = new HashMap<>();
        int maxSize=0;
        int count=0;

        for(int i=1;i<=n;i++){
        int digitSum = findDigitSum(i);

        mp.put(digitSum ,mp.getOrDefault(digitSum,0)+1);
        int currentsize = mp.get(digitSum);

        if(currentsize == maxSize){
            count++;
        }else if(currentsize > maxSize){
            maxSize = currentsize;
            count=1;
        }
        }
        return count;
    }
}