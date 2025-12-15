/*
Problem: <Two Sum>
Topic: <Array>
Approach: <brute Force - using two loops check the target sum>
Time Complexity: O(𝑛^2)
Space Complexity: O()
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int n=nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if((nums[i]+nums[j]) == target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}

/*
Problem: <Two Sum>
Topic: <HashMap>
Approach: <Optimized - Use a HashMap to check if it contain other number , num = target- num[i>
Time Complexity: O(𝑛)
Space Complexity: O(n)
*/
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = target-nums[i];
            if(hm.containsKey(j)){
                return new int[]{i, hm.get(j)};
            }
            hm.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
