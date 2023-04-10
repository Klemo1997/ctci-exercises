package ctci.exercises._1_arrays_and_strings.palindrome_permutation;

public class PalindromePermutation {
    /*
     * Solution is all about defining what is a palindrome and permutation
     * Palindrome - string that is same forwards and backwards
     * Permutation - same string, but with letters in different order
     * So we need to check if we can order letters somehow so the input will become palindrome
     *
     * The conditions are that all character counts but one (or zero) must be even. So we'll allow at most 1 odd letter
     */
    public boolean isPalindromePermutation(String s) {
        int bits = 0;
        for (int i = 0; i < s.length(); i++) {
            // XOR is nice way to flip our bits
            if (s.charAt(i) != ' ') bits ^= (1 << s.charAt(i)-'a');
        }
        int oddCount = 0;
        for (int i = 0; i < 'z'-'a'+1; i++) {
            if ((bits & (1 << i)) != 0) oddCount++;
        }
        return oddCount <= 1;
    }
}
