package com.advanced.fileHandling;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File folder = new File("./Demo/DSA");
        if (folder.delete()){
            System.out.println("Folder " + folder.getName() + " Deleted.");
        }else {
            System.out.println("Failed to delete the folder");
        }
    }
}
