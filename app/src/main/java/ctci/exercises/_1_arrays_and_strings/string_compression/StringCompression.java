package ctci.exercises._1_arrays_and_strings.string_compression;

public class StringCompression {
    public String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int ctr = 0;
        for (int i = 0; i < str.length(); i++) {
            ctr++;
            if (i + 1 == str.length() || str.charAt(i) != str.charAt(i+1)) {
                compressed.append(str.charAt(i)).append(ctr);
                ctr = 0;
            }
            if (compressed.length() >= str.length()) return str;
        }
        return compressed.toString();
    }
}
