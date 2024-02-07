package com.example.Junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberUtilsTest {
  
  @Test
  void NumberUtilsTest1() {
    assertEquals(true, NumberUtils.isEven(2));
    assertEquals(false, NumberUtils.isEven(3));
    assertEquals(true, NumberUtils.isEven(4));
    assertEquals(true, NumberUtils.isEven(12));
    assertEquals(false, NumberUtils.isEven(7));
    assertEquals(false, NumberUtils.isEven(1));
  }
  @Test
  
  void NumberUtilsTest2() {
    assertEquals(1, NumberUtils.calculateFactorial(1));
    assertEquals(2, NumberUtils.calculateFactorial(2));
    assertEquals(6, NumberUtils.calculateFactorial(3));
    assertEquals(24, NumberUtils.calculateFactorial(4));
    assertEquals(120, NumberUtils.calculateFactorial(5)); 
    assertEquals(1, NumberUtils.calculateFactorial(0));  
  }

}
