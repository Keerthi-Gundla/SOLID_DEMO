package com.basics.solidprinciples;

interface Manufacturer{
     void productModel();
     String getName();
}

public class Product {
    public String productName;
    public double price;
    Manufacturer manufacturer;
    public Product(String productName,double price,Manufacturer m){
        this.productName=productName;
        this.price=price;
        manufacturer=m;
    }

    public void printProductDetails(){
        System.out.println(String.format("product name : %s\nproduct price :  %.3f \nManufacturer : %s",productName,price,manufacturer.getName()));
        manufacturer.productModel();
    }

}

class Volva implements Manufacturer{
    public String model;
    public String name="volva";
    public Volva(String model){
        this.model=model;
    }
    public void productModel(){
        System.out.println("product model is "+model);
    }

    public String getName(){
        return name;
    }
}

class Oslo implements Manufacturer{
    public String model;
    public String name="Oslo";
    public Oslo(String model){
        this.model=model;
    }
    public void productModel(){
        System.out.println("product model is "+model);
    }

    public String getName(){
        return name;
    }
}