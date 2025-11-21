package com.example;

import org.junit.Test;

public class AppTest {
    @Test
    public void alwaysFails() {
        throw new RuntimeException("Intentional failure for cache test.");
    }
}