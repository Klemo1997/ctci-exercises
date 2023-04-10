package ctci.exercises._1_arrays_and_strings.palindrome_permutation;

public class PalindromePermutation {
    /*
     * We increase the size of freq array to support ASCII set of first 128 characters.
     * Then it is all about counting the occurrences of characters and comparing them between strings.
     * If they do have same number of all characters, they are palindrome permutations of each other.
     */
    public boolean isPalindromePermutation(String s) {
        int[] freq = new int['z'-'a'+1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') continue;
            freq[s.charAt(i)-'a']++;
        }
        int oddCount = 0;
        for (int c: freq) {
            if (c % 2 == 1) oddCount++;
            if (oddCount > 1) return false;
        }
        return true;
    }
}
