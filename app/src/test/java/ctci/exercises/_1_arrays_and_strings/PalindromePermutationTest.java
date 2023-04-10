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
    public void testIsPalindromePermutation(boolean expected, String str1, String str2) {
        assertSame(expected, new PalindromePermutation().isPalindromePermutation(str1, str2));
    }

    private static Stream<Arguments> providePalindromePermutation() {
        return Stream.of(
            Arguments.of(true, "", ""),
            Arguments.of(false, "a", "b"),
            Arguments.of(true, "a", "a"),
            Arguments.of(true, "tact coa", "taco cat"),
            Arguments.of(true, "ab cd ef", "fecdba  "),
            Arguments.of(false, "ab cd efs", "fecdba  x"),
            Arguments.of(false, "abcd", "cbac")
        );
    }
}
