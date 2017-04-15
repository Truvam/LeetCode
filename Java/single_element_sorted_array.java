/* 540. Single Element in a Sorted Array */
/*
Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.

Example 1:
Input: [1,1,2,3,3,4,4,8,8]
Output: 2

Example 2:
Input: [3,3,7,7,10,11,11]
Output: 10

Note: Your solution should run in O(log n) time and O(1) space.
*/
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int size = nums.length;
        int value = 0;
        for(int i = 0; i < size; i++) {
            int current = nums[i];
            if(i+1 < size && i-1 >= 0) {
                int next = nums[i+1];
                int ant = nums[i-1];
                if(ant != current && next != current) {
                    value = current;
                    return value;
                }
            }
            else if (i == 0 && i+1 < size) {
                int next = nums[i+1];
                if(current != next) {
                    value = current;
                    return value;
                }
            }
        }
        value = nums[size-1];
        return value;
    }
}

//Runtime: 2ms