package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringWorkTest {
    StringWork stringWork = new StringWork("exe");
    @Test
    public void TestOnPalindrom(){
        Assertions.assertEquals("exe", stringWork.palindrom());
    }
    @Test
    public void TestOnVowels(){
        Assertions.assertEquals(2, stringWork.countVowels());
    }
    @Test
    public void TestOnConsonant(){
        Assertions.assertEquals(1, stringWork.countConsonant());
    }

    @Test
    public void TestOccurrences(){
        Assertions.assertEquals(1, stringWork.countOccurrences("exe"));
    }
}
