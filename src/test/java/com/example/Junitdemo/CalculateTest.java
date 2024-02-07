package com.example.Junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculateTest {

  // write the anotation @Test
  @Test
  void additionTest1() {

    Calculate calculate = new Calculate();
    // assertEquals(12, calculate.addition(4, 8));
    assertTrue(calculate.addition(2, 2) == 4);

  }
  @Test
  void additionTest2() {
    Calculate calculate = new Calculate();
    assertEquals(10, calculate.addition(8, 2));
  }

}
