/*
Problem: <42. Trapping Rain Water>
Topic: <Array>
Approach: <Calculate both left max and right max then take min of both sub tract from height thats ur water level>
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int trap(int[] height) {
        int maxl[] = new int[height.length];
        int maxr[] = new int [height.length];

        maxl[0] = height[0];
        for(int i=1; i<height.length; i++){
            maxl[i] = Math.max(maxl[i-1], height[i]);
        }

        maxr[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            maxr[i] = Math.max(maxr[i+1], height[i]);
        }

        int water=0;
        for(int i=0; i<height.length; i++){
            int min = Math.min(maxl[i], maxr[i]);
            water += (min - height[i]);

        }
        return water;
    }
}

/*
Problem: <42. Trapping Rain Water>
Topic: <Array>
Approach: <Instead of using array to store left and right max use 2 pointers>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxl = 0;
        int maxr = 0;
        int water =0;
        
        while(left<right){
            if(height[left]<=height[right]){

                if(height[left]>=maxl){
                    maxl = height[left];
                }else{
                    water+=(maxl - height[left]);
                }
                left++;

            }else{

                if(height[right]>=maxr){
                    maxr = height[right];
                }
                else{
                    water+=(maxr - height[right]);
                }
                right--;
            }
        }
        return water;
    }
}
