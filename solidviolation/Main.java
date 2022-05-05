package com.basics.solidviolation;

public class Main {
    public static void main(String args[]){
        double finalPrice;

        Shoppe website=new Shoppe();
        website.applyTermsAndConditions();
        website.showHomePage();
        website.initializeCart();

        Signup account=new Signup();
        account.addNewUser("keerthi", "abcd");

        Login user =new Login();
        user.loginUser("keerthi", "1234");

        Product prod=new Product("TV",10000,"v1");
        prod.printProductDetails();

        TotalProductPrice prodPrice=new TotalProductPrice("Electronic", 10000 );
        finalPrice=prodPrice.calculateFinalPrice();
        System.out.println("Final price of Product after discount : "+finalPrice);

        Payment pay=new PaymentThroughUpi(finalPrice);
        pay.upiPayment();
    }
}
