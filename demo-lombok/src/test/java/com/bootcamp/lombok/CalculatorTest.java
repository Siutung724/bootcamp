package com.bootcamp.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// file name suffix = xxxTest.java or xxxTests.java
public class CalculatorTest {

  @Test // Test Annotation -> one test case
  void testSum() {
    Calculator c1 = new Calculator(3, 7);
    Assertions.assertEquals(10, c1.sum());
  }
  
}