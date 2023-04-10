package ctci.exercises._1_arrays_and_strings.urlify;

public class URLify {
    /*
     * In-place transformation approach, if we wouldn't want to modify in-place, with allocated buffer array
     * this would become a trivial problem
     */
    public void urlify(char[] str) {
        if (str.length == 0) return;
        int j = str.length-1;
        while (str[j] == ' ') j--;
        for (int i = str.length-1; i >= 0; i--) {
            if (str[j] == ' ') {
                str[i--] = '0';
                str[i--] = '2';
                str[i] = '%';
            } else {
                str[i] = str[j];
            }
            j--;
        }
    }
}
