package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MonsterTest {
    @Test public void MonsterTostring(){
        Monster classUnderTest = new Monster();
        assertEquals(classUnderTest.name + ":レア度[" + classUnderTest.rare + "]", classUnderTest.toString());
    }

}
