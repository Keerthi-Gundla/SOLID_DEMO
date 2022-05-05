package com.basics.solidviolation;

//violates open/closed principle
class TotalProductPrice {
    private String productType;
    public double price;
    public double discount;
    public TotalProductPrice(String type, double price){
        productType=type;
        this.price=price;
    }

    public double calculateFinalPrice(){
        if(productType=="Electronic"){
            Electronic electronic=new Electronic();
            discount=electronic.getDiscount();
        } else if (productType=="Clothing") {
            Clothing clothing=new Clothing();
            discount=clothing.getDiscount();
        } else if (productType=="grocery") {
            Grocery grocery=new Grocery();
            discount=grocery.getDiscount();
        } else{
            discount=0.0;
        }
        return price-(price*discount);
    }
}

class Electronic{
    public double getDiscount(){
        return 0.2;
    }
}

class Clothing{
    public double getDiscount(){
        return 0.3;
    }
}

class Grocery{
    public double getDiscount(){
        return 0.1;
    }
}