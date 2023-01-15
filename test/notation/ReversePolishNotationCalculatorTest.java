package notation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        int numbers = reversePolishNotationCalculator.calculatePolishNotation("1 2 3 +");
        Assertions.assertEquals(5, numbers);
    }

    @Test
    public void shouldCalculateSubtraction() {
        int numbers = reversePolishNotationCalculator.calculatePolishNotation("1 3 3 -");
        Assertions.assertEquals(0, numbers);
    }

    @Test
    public void shouldCalculateMultiply() {
        int numbers = reversePolishNotationCalculator.calculatePolishNotation("1 3 3 *");
        Assertions.assertEquals(9, numbers);
    }

    @Test
    public void shouldCalculateNegativeNumber() {
        int numbers = reversePolishNotationCalculator.calculatePolishNotation("1 -3 -4 +");
        Assertions.assertEquals(-7, numbers);
    }

    @Test
    public void shouldHandledCorrectlyWhitespaceCharacter() {
        int numbers = reversePolishNotationCalculator.calculatePolishNotation("1 2 3");
        Assertions.assertEquals(3, numbers);
    }
}