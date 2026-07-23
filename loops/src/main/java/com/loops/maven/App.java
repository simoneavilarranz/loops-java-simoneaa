package com.loops.maven;

import java.util.List;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        MultiplicationTable tabla = new MultiplicationTable();
        List<String> resultado = tabla.createTable(6);
        TablePrinter printer = new TablePrinter();
        printer.printTable(resultado);
    }

}
