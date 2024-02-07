package com.example.Junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GradesTest {
  
  @Test
  void gradesA() {
    Grades grades = new Grades();
    
    assertEquals('A', grades.grade(95));
  }
  @Test
  void gradesB() {
    Grades grades = new Grades();
    
    assertEquals('B', grades.grade(87));
  }
  @Test
  void gradesC() {
    Grades grades = new Grades();
    
    assertEquals('C', grades.grade(79));
  }
  @Test
  void gradesD() {
    Grades grades = new Grades();
    
    assertEquals('D', grades.grade(68));
  }
  @Test
  void gradesF() {
    Grades grades = new Grades();
    
    assertEquals('F', grades.grade(50));
  }
  
  @Test
  void edgeTestGradeA() {
    Grades grades = new Grades();
    
    assertEquals('A', grades.grade(90));
  }
  @Test
  void edgeTestGradeB() {
    Grades grades = new Grades();
    
    assertEquals('B', grades.grade(80));
  }
  @Test
  void edgeTestGradeC() {
    Grades grades = new Grades();
    
    assertEquals('C', grades.grade(70));
  }
  @Test
  void edgeTestGradeD() {
    Grades grades = new Grades();
    
    assertEquals('D', grades.grade(60));
  }
  @Test
  void edgeTestGradeF() {
    Grades grades = new Grades();
    
    assertEquals('F', grades.grade(51));
  }

}
