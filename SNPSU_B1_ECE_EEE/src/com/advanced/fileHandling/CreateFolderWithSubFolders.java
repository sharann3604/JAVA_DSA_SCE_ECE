package com.advanced.fileHandling;

import java.io.File;

public class CreateFolderWithSubFolders {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\USER\\Desktop\\SNPSU-Java-DSA\\SNPSU_ECE_EEE_Java_DSA\\SNPSU_B1_ECE_EEE\\Demo\\F1\\F2\\F3\\F4\\F5");
                if(folder.mkdirs()){
                    System.out.println("Folder: " + folder.getName()+ " Created");
                }else {
                    System.out.println("Folder already Exists");
                }
    }
}
