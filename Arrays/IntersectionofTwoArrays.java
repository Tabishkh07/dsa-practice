/*
Problem: <349. Intersection of Two Arrays>
Topic: <Array + HashSet>
Approach: <Use a HashSet to store elements of nums1, iterate through nums2 to collect common unique elements, and return 
them as an array.>
Time Complexity: O(n+m)
Space Complexity: O(n)
*/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            hs.add(nums1[i]);
        }
        int k=0;
        for(int i=0; i<nums2.length; i++){
            if(hs.contains(nums2[i])){
                al.add(nums2[i]);
                k++;
                hs.remove(nums2[i]);
            }
        }  
        int arr[] = new int[al.size()];
        for(int i=0; i<al.size(); i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}
