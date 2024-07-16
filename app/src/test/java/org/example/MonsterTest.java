package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
    @Test public void testsummonmonster() {
        Monster classUnderTest = new Monster();
        assertEquals("スライム", classUnderTest.summonMonster(0));
        assertEquals("サハギン", classUnderTest.summonMonster(1));
        assertEquals("ドラゴン", classUnderTest.summonMonster(2));
        assertEquals("デュラハン", classUnderTest.summonMonster(3));
        assertEquals("シーサーペント", classUnderTest.summonMonster(4));
    }
}
