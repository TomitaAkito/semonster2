package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void megaTest() {
    // インスタンス生成
    Monster classUnderTest = new Monster();

    // レア度3
    classUnderTest.rare = 3;
    assertEquals("メガ" + classUnderTest.name,
        classUnderTest.print());

    // レア度2
    classUnderTest.rare = 2;
    assertEquals(classUnderTest.name,
        classUnderTest.print());
  }
}
