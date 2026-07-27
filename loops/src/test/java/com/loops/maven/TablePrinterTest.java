package com.loops.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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

    @Test
    void testPrintTable() {
        TablePrinter printer = new TablePrinter();
        List<String> input = List.of("5 x 1 = 5", "5 x 2 = 10");
        
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        
        printer.printTable(input);
        
        System.setOut(originalOut);
        
        String expected = "5 x 1 = 5\n5 x 2 = 10";
        assertEquals(expected, baos.toString());
    }

}
