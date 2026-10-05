package com.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class app {

    public static void main(String[] args) throws IOException {

        String file = "src/main/java/com/app.java";

        long lines = Files.lines(Paths.get(file)).count();

        System.out.println("================================");
        System.out.println("       TOTAL LINES OF CODE");
        System.out.println("================================");
        System.out.println("File : app.java");
        System.out.println("LOC  : " + lines);
        System.out.println("================================");
    }
}
