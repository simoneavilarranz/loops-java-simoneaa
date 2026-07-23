package com.loops.maven;

import java.util.List;

public class TablePrinter {
    
    public String formatTable(List<String> tabla) {
        return String.join("\n", tabla);
    }
    
    public void printTable(List<String> tabla) {
        System.out.print(formatTable(tabla));
    }
}
