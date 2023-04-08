package ctci.exercises._1_arrays_and_strings.is_unique;

import java.util.Arrays;

public class IsUnique {
    /*
     * For simplicity, we consider only strings of lowercase english letters,
     * if there were more characters in set, we can use either a hashmap or a sufficiently large array
     */
    public boolean isUnique(String str) {
        int bits = 0;
        for (char c: str.toCharArray()) {
            int cBit = 1 << c-'a';
            if ((cBit & bits) == 1) return false;
            bits |= cBit;
        }
        return true;
    }


    /*
     * Follow-up - a solution no additional space
     * Since Java has limited API for string sorting, we have to create at least
     * char array, which is easily sortable for simplicity.
     */
    public boolean isUnique2(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]) return false;
        }
        return true;
    }
}
