package com.luv2code.springboot.thymeleafdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyTestDemo {

    @Test
    public void testDemo() {
        String greeting = "Hello GitHub Action!";

        Assertions.assertEquals("Hello GitHub Action!", greeting);
    }
}
