package com.springcore.lifecycle;
//lifecycle of
public class Samosa {
    private  double price;

    public Samosa() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    public  void  init(){
        System.out.println("in side init method ");
    }
    public  void destroy(){
        System.out.println("in side destroy method");
    }
}

