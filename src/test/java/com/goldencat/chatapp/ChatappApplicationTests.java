package com.goldencat.chatapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // This tells Spring to use "application-test.properties"
class ChatappApplicationTests {

    @Test
    void contextLoads() {
    }
}

