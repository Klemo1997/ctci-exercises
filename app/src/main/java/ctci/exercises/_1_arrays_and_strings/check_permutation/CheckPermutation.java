package ctci.exercises._1_arrays_and_strings.check_permutation;

public class CheckPermutation {
    public boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] freq1 = new int['z'-'a'+1];
        int[] freq2 = new int['z'-'a'+1];

        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i)-'a']++;
            freq2[str2.charAt(i)-'a']++;
        }

        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] != freq2[i]) return false;
        }

        return true;
    }
}
