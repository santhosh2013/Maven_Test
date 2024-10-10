package com.example.Test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdditionTest {
    
    @Test
    public void testAdd() {
        Addition addition = new Addition();
        int result = addition.add(5, 3);
        assertEquals("trst for add",8, result);
    }
}