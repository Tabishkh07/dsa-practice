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
Approach 1: <Done using 2 equation solving>
Time Complexity: O(n^2)
Space Complexity: O(1)
*/
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        int N = arr.length;
        // Total numbers should be from 1 to n
        int n = N * N;
        long actualSum = 0;
        long actualSumSq = 0;
        // Expected sum of numbers from 1 to n
        long expectedSum = (long) n * (n + 1) / 2;
        // Expected square sum of numbers from 1² to n²
        long expectedSumSq = (long) n * (n + 1) * (2L * n + 1) / 6;
        // Calculate actual sum and actual square sum from the grid
        for (int[] row : arr) {
            for (int num : row) {
                actualSum += num;
                actualSumSq += (long) num * num;
            }
        }
        // diff1 = Missing - Repeated
        long diff1 = expectedSum - actualSum;

        // diff2 = Missing² - Repeated²
        long diff2 = expectedSumSq - actualSumSq;
        /*
         * We know:
         * Missing² - Repeated²
         * = (Missing - Repeated)(Missing + Repeated)
         * diff2 = diff1 * (Missing + Repeated)
         * Therefore:
         * Missing + Repeated = diff2 / diff1
         */
        long sumMR = diff2 / diff1;
        /*
         * Equations:
         * Missing - Repeated = diff1
         * Missing + Repeated = sumMR
         * Adding both:
         * 2 * Missing = diff1 + sumMR
         */
        long missing = (diff1 + sumMR) / 2;
        // Repeated = (Missing + Repeated) - Missing
        long repeated = sumMR - missing;
        // LeetCode expects [Repeated, Missing]
        return new int[]{(int) repeated, (int) missing};
    }
}

/* 
    Math Approach

Let:
m = Missing
r = Repeated

1. m - r = ExpectedSum - ActualSum

2. m² - r² = ExpectedSquareSum - ActualSquareSum

3. m² - r² = (m-r)(m+r)

=> m + r = diff2 / diff1

Now:
m - r = diff1
m + r = sumMR

m = (diff1 + sumMR)/2
r = sumMR - m

TC: O(n²)
SC: O(1)
*/
