package com.advanced.fileHandling;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\USER\\Desktop\\SNPSU-Java-DSA\\SNPSU_ECE_EEE_Java_DSA\\SNPSU_B1_ECE_EEE\\Demo\\DSA");
                if(folder.mkdir()){
                    System.out.println("Folder: " + folder.getName()+ " Created");
                }else {
                    System.out.println("Folder already Exists");
                }
    }
}
