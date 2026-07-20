/*
Problem: <18. 4Sum>
Topic: <Array + ArrayList>
Approach: <2 Pointers and 2 fixed no - fixed two then check if other 2 sum to fixed one -- for duplication always check all of the pointers not just one >
Time Complexity: O(n^3)
Space Complexity: O(n)
*/

// Solve 3 sum 1st then just add 1 more loop.
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        int l=0;
        while(l<nums.length-3){
            int i=l+1;;
            while(i<nums.length-2){
                int j = i+1;
                int k = nums.length-1;
                while(j<k){
                    long sum = (long)nums[j]+(long)nums[k]+(long)nums[i];
                    if(sum > target-nums[l]){
                        k--;
                    }
                    else if(sum < target-nums[l]){
                        j++;
                    }
                    else{
                        List<Integer>li = new ArrayList<>();
                        li.add(nums[l]);
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        

                        list.add(li);
                        j++;
                        k--;

                        // duplication
                        while(j<k && nums[j] == nums[j-1]){
                            j++;
                        }
                        while(j<k && nums[k] == nums[k+1]){
                            k--;
                        }
                    } 
                }
                i++;
                while(i<nums.length-2 && nums[i] == nums[i-1]){
                   i++;
                }
            }
            l++;
            while(l<nums.length-3 && nums[l] == nums[l-1]){
               l++;
            }
        }
        return list;
    }
}
