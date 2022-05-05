package com.basics.solidprinciples;

interface PaymentThroughUpi{
    public void upiPayment(double price);
}

interface PaymentThroughDebitCard{
    public void debitCardPayment(double price);
}

interface PaymentThroughCreditCard{
    public void creditCardPayment(double price);
}

class UpiPayment implements PaymentThroughUpi{
    @Override
    public void upiPayment(double price) {
        System.out.println("Amount : "+price+"Payment done through UPI ");
    }
}

class DebitCardPayment implements PaymentThroughDebitCard{
    @Override
    public void debitCardPayment(double price) {
        System.out.println("Amount : "+price+"Payment done through debit card");
    }
}

class CreditCardPayment implements PaymentThroughCreditCard{
    @Override
    public void creditCardPayment(double price) {
        System.out.println("Amount : "+price+"payment done through credit card");
    }
}
