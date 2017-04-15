/* 1. Two Sum */
/* 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] values = new int[2];
        int size = nums.length;
        for(int i = 0; i < size; i++) {
            int val1 = nums[i];
            if(i+1 < size) {
                for(int j = i+1; j < size; j++){
                    int val2 = nums[j];
                    int sum = val1+val2;
                    if(sum == target) {
                        values[0] = i;
                        values[1] = j;
                        return values;
                    }
                }
            }
                
        }
       return values; 
    }
}

//Runtime: 2ms