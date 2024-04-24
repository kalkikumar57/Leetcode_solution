class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n==2){
            return 1;
        }
        int tribonacci_num[] = new int[n+1];
        tribonacci_num[0] = 0;
        tribonacci_num[1] = 1;
        tribonacci_num[2] = 1;
        for(int i=3;i<=n;i++){
            tribonacci_num[i] = tribonacci_num[i-1] + tribonacci_num[i-2] + tribonacci_num[i-3];
        }
        return tribonacci_num[n];
    }
}