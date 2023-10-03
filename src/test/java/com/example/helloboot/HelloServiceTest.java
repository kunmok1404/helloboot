package com.example.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HelloServiceTest {

    @Test
    void simpleHelloTest() {
        SimpleHelloService helloService = new SimpleHelloService();
        String res = helloService.sayHello("Test");
        assertThat(res).isEqualTo("hello Test");
    }
}
