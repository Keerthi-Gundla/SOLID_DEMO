package com.basics.solidprinciples;

import java.util.HashMap;

abstract class AccessWebsite{
    public HashMap<String,String> users= new HashMap<String,String>();
    abstract public void loginUser() throws Exception;
}

class Signup extends AccessWebsite{

    public Signup(String username,String password) {
        users.put(username,password);
        System.out.println("User signup with username : "+username);
        loginUser();
    }
    @Override
    public void loginUser() {
        System.out.println("user logged in successfully");
    }
}

class Login extends AccessWebsite{
    public String userName;
    public String password;
    public Login(String userName,String password){
        this.userName=userName;
        this.password=password;
        users.put("john","123");
        users.put("park","web123");
    }

    public void loginUser() throws Exception {
        if(users.get(userName).equals(password)){
            System.out.println("User logged in successfully");
        }else{
            throw new Exception("Invalid username ");
        }
    }
}
