package com.basics.solidviolation;

//interface segregation principle violation
interface Payment {
    public void upiPayment();
    public void creditCardPayment();
    public void debitCardPayment();
}

class PaymentThroughUpi implements Payment{
    double amount;
    PaymentThroughUpi(double amount){
        this.amount=amount;
    }
    public void upiPayment(){
        System.out.println("Amount : "+amount +" payment done.");
    }

    public void creditCardPayment(){
        throw new Error("cannot make payment through credit card");
    }

    public void debitCardPayment(){
        throw new Error("cannot make payment through debit card ");
    };
}
