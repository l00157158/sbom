package com.pipeline;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@SpringBootTest(classes = com.pipeline.prj.PrjApplication.class)
public class AppTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testSayHelloEndpoint() {
        String url = "/hello";
        String response = restTemplate.getForObject(url, String.class);
        assertEquals("Hello, World!! My Name is Jimmy; This is a Pipeline demo Ver 0.3 ", response);
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
