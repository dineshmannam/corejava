package com.dineshmannam;
import java.io.Console;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class userInput {
    public static void main(String[] args) throws IOException {
        Console console = System.console();
        String name = console.readLine("Enter your name: ");
        byte b[] = name.getBytes();
        try (FileOutputStream tar = new FileOutputStream("/output.txt")) {
            tar.write(b);
            tar.close();
        }
        System.out.println("success...");
    }
}
