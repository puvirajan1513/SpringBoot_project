package com.tnsif.corespring;

import org.junit.Test;

public class AppTest {
    @Test
    public void testDocument() {
        Document doc = new Document("Test Doc", "This is test content.");
        doc.display();
    }
}