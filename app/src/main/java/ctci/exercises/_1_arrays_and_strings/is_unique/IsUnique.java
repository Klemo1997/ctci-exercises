package ctci.exercises._1_arrays_and_strings.is_unique;

public class IsUnique {
    /*
     * For simplicity, we consider only strings of lowercase english letters,
     * if there were more characters in set, we can use either a hashmap or a larger array
     */
    public boolean isUnique(String str) {
        int[] frequencies = new int['z'-'a'+1];
        for (char c: str.toCharArray()) {
            if (frequencies[c-'a'] > 0) return false;
            frequencies[c-'a']++;
        }
        return true;
    }
}
