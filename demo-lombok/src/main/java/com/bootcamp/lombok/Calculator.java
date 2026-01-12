package com.bootcamp.lombok;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// ! 1. JDK + auto import (java.lang) i.e. String
// ! 2. JDK + custom import i.e. LocalDate, BigDecimal
// ! 3. Maven -> external library, pom.xml -> dependency (Class File)

// Maven Steps:
// 1. mvn clean (delete target folder)
// 2. mvn compile (Compile main code)
// 3. mvn test(Step 2 + compile test code + run test cases(all result OK))
// 4. mvn install (Step 3 + generate jar file + move to m2 folder)

@Getter
@Setter
@AllArgsConstructor
public class Calculator {
  private int x;
  private int y;

  public int sum() {
    return this.x + this.y;
  }

  public static void main(String[] args) {
    String s = "hello";
    StringBuilder s1 = new StringBuilder();
    Math.abs(-1);
    Integer x = 3;
    double k = 10.0;

    LocalDate ld = LocalDate.of(2000, 1, 13);
  }
}