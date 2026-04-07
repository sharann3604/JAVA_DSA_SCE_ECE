package com.advanced.fileHandling;

import java.io.FileWriter;

public class WriteDataToFile {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("./Demo/current_status.txt");
        writer.append("\n If we have exam tomorrow, we will study today itself, definitely not before");
        writer.close();
        System.out.println("Successfully wrote data into the file");
    }
}
