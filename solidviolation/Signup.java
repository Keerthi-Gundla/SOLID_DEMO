package com.basics.solidviolation;

import java.util.HashMap;

//violates liskov substitution principle
public class Signup {
    public HashMap<String,String> users= new HashMap<String,String>();

    public void addNewUser(String username,String password) {
        users.put(username,password);
        System.out.println("User signup with username : "+username);
        loginUser();
    }
    public void loginUser(){
        System.out.println("user logged in successfully");
    }
}

class Login extends Signup{

    public void loginUser(String username,String password){
        if(users.get(username)==password){
            System.out.println("User logged in successfully");
        }else{
            System.out.println("Invalid username or password");
        }
    }

}