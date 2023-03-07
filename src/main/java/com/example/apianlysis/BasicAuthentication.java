package com.example.apianlysis;

import java.util.Base64;

public class BasicAuthentication {

    private String username = "admin";
    private String password = "1234";

    public BasicAuthentication() {}

    public BasicAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private void printBasicAuthenticationHeader() {
        String valueToEncode = username + ":" + password;
        String encodingMSg = Base64.getEncoder().encodeToString(valueToEncode.getBytes());
        System.out.println("Authentication : " + encodingMSg);
    }

    private String getBasicAuthenticationHeader(String username, String password) {
        String valueToEncode = username + ":" + password;
        String encodingMSg = Base64.getEncoder().encodeToString(valueToEncode.getBytes());
        return encodingMSg;
    }

}
