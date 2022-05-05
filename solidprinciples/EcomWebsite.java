package com.basics.solidprinciples;

//Single responsibility

class Shop {
    public void showHomePage(){
        System.out.println("Home page");
    }
}

class TermsAndConditions{
    public void addTermsAndConditions() {
        System.out.println("Terms and conditions Applied");
    }
}

class Cart{
    public void initializeCart(){
        System.out.println("cart is initialized.");
    }
}