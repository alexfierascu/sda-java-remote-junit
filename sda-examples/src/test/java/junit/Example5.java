package junit;

import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import util.Calculator;

public class Example5 {

  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Test
  public void shouldThrowExceptionWhenDividingBy0() {
    // give
    expectedException.expect(ArithmeticException.class);
    expectedException.expectMessage("/ by zero");
    Calculator calculator = new Calculator();
    int number = new Random().nextInt();
    // when
    calculator.divide(number, 0);
    // then
    // should throw expected exception
  }

}
