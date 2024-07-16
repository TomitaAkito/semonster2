package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test public void MonsterTostring(){
    Monster classUnderTest = new Monster();
    assertEquals(classUnderTest.megaEvolution() + ":レア度[" + classUnderTest.rare + "]", classUnderTest.toString());
  }

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

  @Test
  public void testsummonmonster() {
    Monster classUnderTest = new Monster();
    assertEquals("スライム", classUnderTest.summonMonster(0));
    assertEquals("サハギン", classUnderTest.summonMonster(1));
    assertEquals("ドラゴン", classUnderTest.summonMonster(2));
    assertEquals("デュラハン", classUnderTest.summonMonster(3));
    assertEquals("シーサーペント", classUnderTest.summonMonster(4));
  }
}
