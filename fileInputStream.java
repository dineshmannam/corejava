package com.dineshmannam;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStream {
    public static void main(String[] args) throws IOException {
        try (FileInputStream obj = new FileInputStream("/input.txt")) {
            int i = 0;
            while ((i = obj.read()) != -1) {
                System.out.println((char) i);
            }
            obj.close();
        }
    }

}
