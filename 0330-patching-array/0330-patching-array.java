class Solution{
public int minPatches(int[] nums, int n) {
    long miss = 1;     // This is the smallest number that we can't form yet.
    int result = 0;    // This will count how many numbers we need to add.
    int i = 0;         // This is the index to iterate through the nums array.

    while (miss <= n) { // Continue until we can form all numbers up to n.
        if (i < nums.length && nums[i] <= miss) { // If current number in nums can help form miss
            miss += nums[i]; // Add this number to our range of numbers we can form.
            i++; // Move to the next number in the array.
        } else {
            miss += miss; // Otherwise, add miss itself to the range by patching it.
            result++; // Increment the count of patches we need.
        }
    }

    return result; // Return the total patches needed.
}
}


// Initialization:

// miss is set to 1 because initially, the smallest number we can't form is 1.
// result is set to 0 to count how many patches (or additional numbers) we need.
// i is set to 0 to start from the beginning of the nums array.
// Loop:

// The loop runs as long as miss is less than or equal to n. This ensures that we are trying to form all numbers up to n.
// Inside the Loop:

// If Condition: if (i < nums.length && nums[i] <= miss)
// This checks if the current number in nums can be used to form the current miss.
// If nums[i] is less than or equal to miss, it means we can use nums[i] to help form the number miss.
// We then add nums[i] to miss because adding this number extends the range of numbers we can form.
// Move to the next number in the nums array by incrementing i.
// Else Condition: else
// If nums[i] is greater than miss or if we've exhausted all numbers in the array, we need to patch (add a new number).
// We add miss itself to our range of numbers we can form. This effectively doubles miss (because miss + miss).
// Increment the result because we've added a new number (a patch).
// Return Result:

// After the loop finishes, result contains the number of patches needed to ensure we can form all numbers from 1 to n.
// Example Walkthrough:
// Suppose nums = [1, 3] and n = 6.

// Initially, miss = 1.
// nums[0] = 1 is less than or equal to miss, so we can use 1:
// miss = 1 + 1 = 2
// Move to the next number, i = 1.
// Now, miss = 2.
// nums[1] = 3 is greater than miss, so we need to add a patch:
// miss = 2 + 2 = 4
// Increment result, result = 1.
// Now, miss = 4.
// nums[1] = 3 is less than miss, so we can use 3:
// miss = 4 + 3 = 7
// Move to the next number, i = 2.
// Now, miss = 7, which is greater than n, so the loop ends.
// The result is 1, meaning we need one patch to form all numbers from 1 to 6.