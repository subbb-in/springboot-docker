package com.springboot_aws;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class repositoryTest {

    @Test
    public void testInsert(){
        int a = 5;

        assertEquals(a, 5);
    }
}
