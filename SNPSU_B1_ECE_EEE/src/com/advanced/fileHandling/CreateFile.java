package com.advanced.fileHandling;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) throws Exception {
        File file = new File("./Demo/current_status.txt");
        if (file.createNewFile()){
            System.out.println("File " + file.getName() + " Created");
        }else {
            System.out.println("Failed to create a File");
        }
    }
}
