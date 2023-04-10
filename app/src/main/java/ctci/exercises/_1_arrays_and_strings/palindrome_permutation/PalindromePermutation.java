package ctci.exercises._1_arrays_and_strings.palindrome_permutation;

public class PalindromePermutation {

    public static final int ASCII_SIZE = 128;

    /*
     * We increase the size of freq array to support ASCII set of first 128 characters.
     * Then it is all about counting the occurrences of characters and comparing them between strings.
     * If they do have same number of all characters, they are palindrome permutations of each other.
     */
    public boolean isPalindromePermutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] freq = new int[ASCII_SIZE];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }
        for (int c: freq) {
            if (c != 0) return false;
        }
        return true;
    }
}
