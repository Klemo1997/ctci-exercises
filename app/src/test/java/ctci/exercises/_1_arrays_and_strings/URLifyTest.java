package ctci.exercises._1_arrays_and_strings;

import ctci.exercises._1_arrays_and_strings.urlify.URLify;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class URLifyTest {
    @ParameterizedTest
    @MethodSource("provideURLify")
    public void testIsUnique(char[] expected, char[] str) {
        new URLify().urlify(str);
        assertArrayEquals(expected, str);
    }

    private static Stream<Arguments> provideURLify() {
        return Stream.of(
            Arguments.of("".toCharArray(), "".toCharArray()),
            Arguments.of("test".toCharArray(), "test".toCharArray()),
            Arguments.of("this%20is%20a%20test".toCharArray(), "this is a test      ".toCharArray()),
            Arguments.of("Mr%20John%20Smith".toCharArray(), "Mr John Smith    ".toCharArray())
        );
    }
}
