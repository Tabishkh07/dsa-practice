/*
Problem: <239. Sliding Window Maximum>
Topic: <Array + Deque>
Approach: <Use a monotonic decreasing deque of indices, removing smaller/expired elements so the front always gives the maximum of the current window.>
Time Complexity: O(n)
Space Complexity: O(k)
*/
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arr[] = new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        int j = 0;

        for(int i=0; i<nums.length; i++){
            // remove 1st element
            while(!dq.isEmpty() && dq.peekFirst()< i-k+1){
                dq.pollFirst();
            }

            // remove smaller element
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }

            // add element
            dq.offerLast(i);

            // Window is ready
            if(i >= k-1){
                arr[j++] = nums[dq.peekFirst()];
            }
        }
        return arr;
    }
}
