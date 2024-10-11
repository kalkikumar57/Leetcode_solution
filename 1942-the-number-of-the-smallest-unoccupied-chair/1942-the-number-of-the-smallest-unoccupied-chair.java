

class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        int[] endTimes = new int[n]; // This will store the end times of each chair
        
        // Store the arrival time of the target friend
        int targetArrivalTime = times[targetFriend][0];
        
        // Sort the times based on arrival time
        Arrays.sort(times, (a, b) -> a[0] - b[0]); // Using a normal sorting method
        
        for (int[] time : times) {
            int arrival = time[0];
            int depart = time[1];
            
            // Find the first unoccupied chair
            for (int i = 0; i < n; i++) {
                if (endTimes[i] <= arrival) {
                    endTimes[i] = depart; // Update the chair with the current friend's depart time
                    
                    if (arrival == targetArrivalTime) {
                        return i; // Return the chair number if it's the target friend
                    }
                    break; // Break after assigning a chair
                }
            }
        }
        
        return -1; // This line should never be reached given the problem constraints
    }
}
