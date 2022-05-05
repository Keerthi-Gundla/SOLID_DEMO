package com.basics.solidprinciples;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main{
    Scanner keyboard=new Scanner(System.in);

    public static void main(String args[]) throws Exception{
        Scanner keyboard=new Scanner(System.in);
        Shop website=new Shop();
        website.showHomePage();

        TermsAndConditions terms=new TermsAndConditions();
        terms.addTermsAndConditions();

        Cart cart=new Cart();
        cart.initializeCart();

        Main main=new Main();
        main.accessWebsite();
        Discount discount=main.getDiscount();

        System.out.println("Enter the product and price");
        String product=keyboard.nextLine();
        double price=keyboard.nextDouble();
        keyboard.nextLine();

        main.getProductDetails(product,price);

        TotalProductPrice prodPrice=new TotalProductPrice(discount,price);
        double finalPrice=prodPrice.calculatePrice();
        System.out.println("Final price of product after discount : "+finalPrice);

        main.makePayment(finalPrice);
    }

    public void accessWebsite(){
        System.out.println("if new user enter 1 if not enter 2");
        int verify=keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter the username : ");
        String userName=keyboard.nextLine();
        System.out.println("Enter the password : ");
        String password=keyboard.nextLine();
        AccessWebsite shoppe;
        if(verify==1) {
            shoppe = new Signup(userName, password);
        }else if(verify==2) {
            try {
                shoppe = new Login(userName, password);
                System.out.println("username:"+userName+"Password: "+password);
                shoppe.loginUser();
            }catch(Exception e){
                System.out.println("Invalid Username or password");
                exit(0);
            }
        }else{
            System.out.println("invalid input");
            exit(0);
        }
    }

    public Discount getDiscount(){
        System.out.println("Enter the type of product needed");
        String productType=keyboard.nextLine();
        Discount discount=null;
        if(productType.equalsIgnoreCase("Electronic"))
            discount=new Electronic();
        else if(productType.equalsIgnoreCase("Clothing"))
            discount=new Clothing();
        else if(productType.equalsIgnoreCase("Grocery"))
            discount=new Grocery();
        else
        {
            System.out.println("requested product type not available");
            exit(0);
        }
        return discount;
    }

    public void getProductDetails(String product, double price){
        System.out.println("Enter the manufacturer needed.");
        String maker=keyboard.nextLine();
        if(maker.equalsIgnoreCase("Volva") || maker.equalsIgnoreCase("Oslo")) {
            System.out.println("Enter the model of the product needed.");
            String model=keyboard.nextLine();
            Manufacturer manufacturer1;

            if(maker.equalsIgnoreCase("Volva"))
                manufacturer1 = new Volva(model);
            else
                manufacturer1=new Oslo(model);
            Product prod1 = new Product(product, price, manufacturer1);
            prod1.printProductDetails();
        }else{
            System.out.println("manufacturer you requested is not available");
            exit(0);
        }
    }

    public void makePayment(double finalPrice){
        System.out.println("Enter the type of payment : 1.UPI payment 2.Debit card payment 3.credit card payment");
        int paymentType=keyboard.nextInt();

        if(paymentType==1) {
            UpiPayment payment = new UpiPayment();
            payment.upiPayment(finalPrice);
        } else if (paymentType==2) {
            DebitCardPayment payment= new DebitCardPayment();
            payment.debitCardPayment(finalPrice);
        }else if(paymentType==3){
            CreditCardPayment payment=new CreditCardPayment();
            payment.creditCardPayment(finalPrice);
        }else{
            System.out.println("Payment option selected is invalid");
            exit(0);
        }
    }
}
