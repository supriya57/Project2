package com.simplilearn.Project2;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Project2ApplicationTests {

    private Project2ApplicationTests analyser = new Project2ApplicationTests();
    @Test
    public void testWordCount() {
   	 assertEquals(7,analyser.getWordCount("Train to win in the digital economy"));
    }
}

