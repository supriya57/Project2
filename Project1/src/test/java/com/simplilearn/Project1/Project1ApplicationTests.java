package com.simplilearn.Project1;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Project1ApplicationTests {

    private Project1ApplicationTests analyser = new Project1ApplicationTests();
    @Test
    public void testWordCount() {
   	 assertEquals(7,analyser.getWordCount("Train to win in the digital economy"));
    }
}

