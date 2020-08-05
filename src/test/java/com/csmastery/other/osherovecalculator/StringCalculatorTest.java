package com.csmastery.other.osherovecalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/*
int Add(string numbers)
———————————————
The method can take up to two numbers, separated by commas, and will return their sum. 
for example “” or “1” or “1,2” as inputs.
(for an empty string it will return 0)
-------------------------------------
Allow the Add method to handle an unknown amount of numbers
-------------------------------------
Allow the Add method to handle new lines between numbers (instead of commas).
the following input is ok: “1\n2,3” (will equal 6)
the following input is NOT ok: “1,\n” (not need to prove it - just clarifying)
-------------------------------------
Support different delimiters
to change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
the first line is optional. all existing scenarios should still be supported
-------------------------------------
Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed. 
if there are multiple negatives, show all of them in the exception message.
-------------------------------------
-------------------------------------
-------------------------------------
-------------------------------------
-------------------------------------

*/
public class StringCalculatorTest {

  private StringCalculator calc;

  @BeforeEach
  public void init() {
    calc = new StringCalculator();
  }

  @Test
  public void smokeTest() {
    assertThat(calc).isNotNull();
  }

  @Test
  public void emptyReturnsZero() throws Exception {
    assertThat(calc.calculate("")).isZero();
  }

  @Test
  public void singleIntegerIsReturned() throws Exception {
    assertThat(calc.calculate("0")).isZero();
  }

  @Test
  public void twoReturnsTwoAsNumber() throws Exception {
    assertThat(calc.calculate("2")).isEqualTo(2);
  }

  @Test
  public void twoNumbersAreAddedTogether() throws Exception {
    assertThat(calc.calculate("1,2")).isEqualTo(3);
  }

  @Test
  public void twoNumbersAreAddedTogether2() throws Exception {
    assertThat(calc.calculate("5,2")).isEqualTo(7);
  }

  @Test
  public void fourNumberAreAddedTogether() throws Exception {
    assertThat(calc.calculate("3,6,1,4")).isEqualTo(14);
  }

  @Test
  public void fourNumberAreAddedTogether2() throws Exception {
    assertThat(calc.calculate("9,1,1,1")).isEqualTo(12);
  }

  @Test
  public void numbersWithNewLineAreAddedTogether() throws Exception {
    assertThat(calc.calculate("1\n2,3")).isEqualTo(6);
  }

  @Test
  public void numbersWithNewLineAreAddedTogether2() throws Exception {
    assertThat(calc.calculate("1\n2\n3")).isEqualTo(6);
  }

  @Test
  public void numbersWithNewLineAreAddedTogether3() throws Exception {
    assertThat(calc.calculate("3,4,5\n6,1\n1")).isEqualTo(20);
  }

  @Test
  public void delimiterIsSZEMIKOLON() throws Exception {
    assertThat(calc.calculate("//;\n1;2")).isEqualTo(3);
  }

  @Test
  public void delimiterIsKVESZCSONMARK() throws Exception {
    assertThat(calc.calculate("//?\n1?2?3\n4")).isEqualTo(10);
  }

  @Test
  public void delimiterIsKVESZCSONMARK2() throws Exception {
    assertThat(calc.calculate("//?\n3?1?1?2\n2\n2\n1")).isEqualTo(12);
  }

  @Test
  public void delimiterIsKVESZCSONMARKAndNegativesArePresentThrowsException() {
    assertThatThrownBy(() -> calc.calculate("//?\n3?1?1?2\n-2\n2\n-1")).hasMessage("negatives not allowed: -2, -1");
  }

  @Test
  public void negativesArePresentThrowsException() {
    assertThatThrownBy(() -> calc.calculate("3,-4,5\n-2\n1")).hasMessage("negatives not allowed: -4, -2");
  }


  @Test
  public void negativesArePresentButTheSeparatorIsDashAtTheSameTimeThrowsException() {
    assertThatThrownBy(() -> calc.calculate("//-\n3--4-5\n1--2\n1-2")).hasMessage("negatives not allowed: -4, -2");
  }

}