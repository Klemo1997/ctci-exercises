package ctci.exercises._1_arrays_and_strings.one_away;

public class OneAway {
    /*
     * This solution takes O(min(m,n)) time, since we need to traverse the shorter string
     * to make a check. If we find first character that differs, then we'll split from this
     * and we'll continue as if we made either an insert, replacement or removal
     */
    public boolean areOneEditAway(String str1, String str2) {
        int i = 0;
        int j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) != str2.charAt(j)) break;
            i++;
            j++;
        }
        if (i == str1.length() && j == str2.length()) return true;
        return check(str1, str2, i, j+1) // addition
                || check(str1, str2, i+1, j) // deletion
                || check(str1, str2, i+1, j+1); // replacement
    }

    private boolean check(String str1, String str2, int i, int j) {
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) != str2.charAt(j)) return false;
            i++;
            j++;
        }
        return i == str1.length() && j == str2.length();
    }
}
