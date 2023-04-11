package ctci.exercises._1_arrays_and_strings;

import ctci.exercises._1_arrays_and_strings.string_compression.StringCompression;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionTest {
    @ParameterizedTest
    @MethodSource("provideCompressString")
    public void testCompressString(String expected, String str) {
        assertEquals(expected, new StringCompression().compressString(str));
    }

    private static Stream<Arguments> provideCompressString() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("a", "a"),
                Arguments.of("aa", "aa"),
                Arguments.of("aab", "aab"),
                Arguments.of("a4b1", "aaaab"),
                Arguments.of("a4b1c5", "aaaabccccc"),
                Arguments.of("a2b1c5a3", "aabcccccaaa"),
                Arguments.of("aaaaaaaaaabcdefgh", "aaaaaaaaaabcdefgh"),
                Arguments.of("a11b1c1d1e1f1g1h1", "aaaaaaaaaaabcdefgh")
        );
    }
}
