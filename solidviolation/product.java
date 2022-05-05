package com.basics.solidviolation;

//violates dependency inversion principle
class Product {
    public String productName;
    public double price;
    public Volva manufacturer;
    public Product(String productName,double price,String model){
        this.productName=productName;
        this.price=price;
        manufacturer=new Volva(model);
    }

    public void printProductDetails(){
        System.out.println("product name : "+productName+ " product price : "+price+" Manufacturer : "+manufacturer.name);
        manufacturer.productModel();
    }
}

class Volva{
    public String model;
    public String name="volva";
    public Volva(String model){
        this.model=model;
    }
    public void productModel(){
        System.out.println("product model is "+model);
    }
}
