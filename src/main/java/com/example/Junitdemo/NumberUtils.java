package com.example.Junitdemo;

public class NumberUtils {
  
  public static boolean isEven(int number) {
    return number % 2 == 0;
  }
  public static int calculateFactorial(int n) {
    if ( n < 0) {
      throw new IllegalArgumentException("not valid factorial");
    }
    if (n ==0 || n ==1) {
      return 1;
    }
    int factorial = 1;
    for(int i = 1; i <= n ; i++) {
      factorial *= i;
    }
    return factorial;
  }

}
