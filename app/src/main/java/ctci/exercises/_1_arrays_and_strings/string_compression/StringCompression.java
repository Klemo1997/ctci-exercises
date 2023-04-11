package ctci.exercises._1_arrays_and_strings.string_compression;

public class StringCompression {
    public String compressString(String str) {
        if (str.length() == 0) return str;
        StringBuilder compressed = new StringBuilder();
        compressed.append(str.charAt(0));
        int ctr = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                ctr++;
                continue;
            }
            compressed.append(ctr);
            compressed.append(str.charAt(i));
            ctr = 1;
            if (compressed.length() >= str.length()) return str;
        }
        compressed.append(ctr);
        String out = compressed.toString();
        return out.length() < str.length() ? out : str;
    }
}
