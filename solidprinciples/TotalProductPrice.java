package com.basics.solidprinciples;

interface Discount{
    public double getDiscount();
}

//open/closed principle
class TotalProductPrice {
    private Discount discount;
    public double price;
    public TotalProductPrice(Discount discount, double price){
        this.discount=discount;
        this.price=price;
    }

    public double calculatePrice(){
        return price -(price*discount.getDiscount());
    }
}

class Electronic implements Discount{
    public double getDiscount(){
        return 0.2;
    }
}

class Clothing implements Discount{
    public double getDiscount(){
        return 0.3;
    }
}

class Grocery implements Discount{
    public double getDiscount(){
        return 0.1;
    }
}