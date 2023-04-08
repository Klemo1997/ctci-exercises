package ctci.exercises._1_arrays_and_strings;


import ctci.exercises._1_arrays_and_strings.is_unique.IsUnique;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertSame;

public class IsUniqueTest {
    @ParameterizedTest
    @MethodSource("provideIsUnique")
    public void testIsUnique(boolean expected, String str) {
        assertSame(expected, new IsUnique().isUnique(str));
    }

    private static Stream<Arguments> provideIsUnique() {
        return Stream.of(
            Arguments.of(true, ""),
            Arguments.of(true, "a"),
            Arguments.of(false, "aa"),
            Arguments.of(true, "abcd"),
            Arguments.of(false, "abcda")
        );
    }
}
