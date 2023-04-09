package ctci.exercises._1_arrays_and_strings;

import ctci.exercises._1_arrays_and_strings.check_permutation.CheckPermutation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertSame;

public class CheckPermutationTest {
    @ParameterizedTest
    @MethodSource("provideIsPermutation")
    public void testIsPermutation(boolean expected, String str1, String str2) {
        assertSame(expected, new CheckPermutation().isPermutation(str1, str2));
    }

    private static Stream<Arguments> provideIsPermutation() {
        return Stream.of(
            Arguments.of(true, "", ""),
            Arguments.of(true, "a", "a"),
            Arguments.of(false, "a", "b"),
            Arguments.of(true, "ab", "ba"),
            Arguments.of(true, "listen", "silent"),
            Arguments.of(true, "absolutely", "yletulosba"),
            Arguments.of(false, "absolutely", "yletulosbx")
        );
    }
}
