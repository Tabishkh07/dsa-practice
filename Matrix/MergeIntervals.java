/*
Problem: <51. Merge Intervals>
Topic: <Array + ArrayList>
Approach: <check for all instead of pair and if not matched then add and important update the current>
Time Complexity: O(nlogn)
Space Complexity: O(n)
*/
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
        ArrayList<int[]> ans = new ArrayList<>();

        int current[] = intervals[0];
        for(int i=1; i<intervals.length; i++){
            if(current[1] >= intervals[i][0]){
                current[1] = Math.max(current[1], intervals[i][1]);
            }
            else{
                ans.add(current);
                current = intervals[i];
            }
        }
        ans.add(current);
        return ans.toArray(new int[ans.size()][]);
    }
}
