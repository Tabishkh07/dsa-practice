/*
Problem: <2965. Find Missing and Repeated Values>
Topic: <Math + HashMap>
Approach 1: <Done using hashmap first thought>
Time Complexity: O(n^2)
Space Complexity: O(n^2)
*/
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n=arr.length;
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                hm.put(arr[i][j], hm.getOrDefault(arr[i][j],0)+1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue()>1){
                ans[0] = entry.getKey();
            }
        }
        for(int i=1; i<=n*n; i++){
            if(!hm.containsKey(i)){
                ans[1] = i;
            }
        }
        return ans;
    }
}

/*
Problem: <2965. Find Missing and Repeated Values>
Topic: <Math>
Approach 1: <Done using hashmap first thought>
Time Complexity: O(n^2)
Space Complexity: O(n^2)
*/
