/*
Problem: <15. 3Sum>
Topic: <Array + ArrayList>
Approach: <2 Pointers and 1 fixed no- fixed one then check if other 2 sum to fixed one -- for duplication always check all of the pointers not just one >
Time Complexity: O(n^2)
Space Complexity: O(n)
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list  = new ArrayList<>();
        int i=0;

        while(i<nums.length-2){
            int j=i+1;
            int k=nums.length-1;
            
            if(i>0 && nums[i] == nums[i-1]){
                i++;
                continue;
            }

            while(j<k){
                if(nums[j]+nums[k] < -nums[i]){
                    j++;
                }
                else if(nums[j]+nums[k] > -nums[i]){
                    k--;
                }
                else{
                    List<Integer>li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(nums[k]);
                    list.add(li);
                    
                    j++;
                    k--;
                    
                    while (j<k &&nums[j]==nums[j-1] ){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]   ){
                        k--;
                        
                    }
                    
                }
            }
            i++;
        }
        
        return list;
    }
}
