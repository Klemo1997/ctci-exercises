package ctci.exercises._1_arrays_and_strings;

import ctci.exercises._1_arrays_and_strings.palindrome_permutation.PalindromePermutation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertSame;

public class PalindromePermutationTest {
    @ParameterizedTest
    @MethodSource("providePalindromePermutation")
    public void testIsPalindromePermutation(boolean expected, String s) {
        assertSame(expected, new PalindromePermutation().isPalindromePermutation(s));
    }

    private static Stream<Arguments> providePalindromePermutation() {
        return Stream.of(
            Arguments.of(true, ""),
            Arguments.of(true, "a"),
            Arguments.of(false, "ab"),
            Arguments.of(true, "aab"),
            Arguments.of(true, "aabb"),
            Arguments.of(false, "aaabbb"),
            Arguments.of(true, "tact coa")
        );
    }
}
