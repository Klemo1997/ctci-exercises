package ctci.exercises._1_arrays_and_strings;

import ctci.exercises._1_arrays_and_strings.one_away.OneAway;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertSame;

public class OneAwayTest {
    @ParameterizedTest
    @MethodSource("provideAreOneEditAway")
    public void testAreOneEditAway(boolean expected, String str1, String str2) {
        assertSame(expected, new OneAway().areOneEditAway(str1, str2));
    }

    private static Stream<Arguments> provideAreOneEditAway() {
        return Stream.of(
            Arguments.of(true, "", ""),
            Arguments.of(true, "a", ""),
            Arguments.of(true, "", "a"),
            Arguments.of(false, "ab", ""),
            Arguments.of(false, "ab", "ba"),
            Arguments.of(true, "pale", "pale"),
            Arguments.of(true, "pale", "ple"),
            Arguments.of(true, "pales", "pale"),
            Arguments.of(true, "pale", "bale"),
            Arguments.of(false, "pale", "bake")
        );
    }
}
