package ctci.exercises._1_arrays_and_strings.check_permutation;

public class CheckPermutation {
    /*
     * This solution compares if count of all characters are same in strings
     * O(1) space approach would use sorting and then compare if sorted strings are equal, this would cost
     * approximately O(nlog(n)) time as a tradeoff
     */
    public boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] freq = new int['z'-'a'+1];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }

        for (int c : freq) {
            if (c != 0) return false;
        }

        return true;
    }
}
