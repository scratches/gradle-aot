package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class ConfigTest {
    @Autowired
    ApplicationContext context;
    @Test
    public void test() throws Exception {
        assertThat(context.getResources("classpath*:/*.txt")).hasSize(1);
    }
}
