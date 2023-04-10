package ctci.exercises._1_arrays_and_strings.palindrome_permutation;

public class PalindromePermutation {
    public boolean isPalindromePermutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] freq = new int['z'-'a'+2];
        for (int i = 0; i < str1.length(); i++) {
            freq[getIndex(str1.charAt(i))]++;
            freq[getIndex(str2.charAt(i))]--;
        }
        for (int c: freq) {
            if (c != 0) return false;
        }
        return true;
    }
    private int getIndex(char c) {
        if (c == ' ') return 26;
        return c - 'a';
    }
}
