package com.example.Junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
  
  @Test
  void additionTest() {
    Calculator addition = new Calculator();
    assertEquals(15, addition.addition(8, 7));
  }
  @Test
  void subtractionTest() {
    Calculator sub = new Calculator();
    assertEquals(-5, sub.subtract(25, 30));
  }
  @Test
  void multiplicationTest() {
    Calculator mul = new Calculator();
    assertEquals(15, mul.multiple(5, 3));
  }
  @Test
  void divisionTest() {
    Calculator div = new Calculator();
    assertEquals(0, div.divide(30, 0));
    assertEquals(2,div.divide(30, 15));
  }
  

}
