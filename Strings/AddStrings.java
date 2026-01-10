/*
Problem: <415: Add Strings >
Topic: <String>
Approach: <Start from the last digits of both strings and add them just like manual addition.
Keep a carry for sums greater than 9 and append (sum % 10) to the result.
Continue until all digits and carry are processed, then reverse the result string.>
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += num1.charAt(i--) - '0';
            if (j >= 0) sum += num2.charAt(j--) - '0';

            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}
