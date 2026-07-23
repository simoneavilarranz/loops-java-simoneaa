package com.loops.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class TablePrinterTest {
    
    @Test
    void testFormatTable() {
        TablePrinter printer = new TablePrinter();
        
        List<String> input = List.of("5 x 1 = 5", "5 x 2 = 10");
        
        String result = printer.formatTable(input);
        
        String expected = "5 x 1 = 5\n5 x 2 = 10";
        
        assertEquals(expected, result);
    }
}
