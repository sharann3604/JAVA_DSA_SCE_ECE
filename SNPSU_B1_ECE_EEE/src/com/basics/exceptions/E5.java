package com.basics.exceptions;

import java.io.IOException;

public class E5 {
    static void readFile() throws IOException{
        throw new IOException("Trying to read the file.");
    }
    public static void main(String[] args) {
        try {
            functions_a();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    static void functions_a()throws IOException{
        function_b();
    }
    static void function_b()throws IOException{
        readFile();
    }
}
/*
⭐ For checked exceptions we always use a try-catch block or throws
⭐ The 'throws' keyword doesn't handle the exception
⭐ It only passes on the information to the calling method
⭐ The calling methods has to handle the exceptions
⭐ The 'throws' keyword is used in the "Method Signature"
⭐ The 'process' of passing on the information is called "DUCKING"
 */


