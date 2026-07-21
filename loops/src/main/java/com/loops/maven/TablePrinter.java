package com.loops.maven;

import java.util.List;

public class TablePrinter {
    
    public TablePrinter() {

    }

    public void printTable(List<String> tabla) {

        for (String linea: tabla) {
            System.out.println(linea);
        }

    }

}
