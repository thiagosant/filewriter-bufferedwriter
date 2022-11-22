package com.sansoft.filewriterbufferedwriter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SpringBootApplication
public class FilewriterBufferedwriterApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilewriterBufferedwriterApplication.class, args);

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
