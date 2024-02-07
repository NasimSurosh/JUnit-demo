package com.example.Junitdemo;

public class Calculator {

  public int addition(int a, int b) {
    return a+b;
  }
  public int subtract(int a, int b) {
    return a-b;
  }
  public int multiple(int a, int b) {
    return a*b;
  }
  public int divide(int a, int b) {
    if(b==0) {
      return 0;
    }
    return a/b;
  }
}
