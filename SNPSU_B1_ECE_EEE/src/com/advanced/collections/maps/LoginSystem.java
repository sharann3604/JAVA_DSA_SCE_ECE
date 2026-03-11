package com.advanced.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class LoginSystem {
    public static void main(String[] args) {
        Map<String,String> users = new HashMap<>();
        users.put("Admin","admin@123");
        users.put("user 1","pass1");
        users.put("user 2","pass 2");
        System.out.println(users);
        users.put("Admin","admin@456");
        System.out.println(users);
        // How do you fetch the passowrd of a user?
        System.out.println(users.get("Admin"));
    }
}
