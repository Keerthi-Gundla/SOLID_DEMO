package com.basics.solidviolation;

//violates single responsibility principle
class Shoppe {
    public void applyTermsAndConditions() {
        System.out.println("Terms and conditions applied.");
    }

    public void showHomePage(){
        System.out.println("Home Page.");
    }

    public void initializeCart(){
        System.out.println("Cart is intialized");
    }
}