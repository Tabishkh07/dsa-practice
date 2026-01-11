/*
Problem: <Hamming Distance>
Topic: <Bit manipulation>
Approach: <Use XOR on the two numbers to find positions where bits differ.
Count the number of 1 bits in the XOR result.
That count is the Hamming distance.>
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;

        while (xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
}

