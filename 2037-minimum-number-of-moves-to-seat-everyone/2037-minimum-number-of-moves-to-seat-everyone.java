class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int[] position = new int[101];
        int n = seats.length;
        
        for(int i=0;i<n;i++){
            position[seats[i]]++;
            position[students[i]]--;
        }
        int result = 0;
        int current = 0;
        
        for(int i:position){
            result = result+Math.abs(current);
            current = current+i;
        }
        return result;
    }
}