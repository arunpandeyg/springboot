package com.springcore.lifecycle;

import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean {
    private  double price;

    public Pepsi() {
        super();
    }

    public Pepsi(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //init
        System.out.println("taking and putting in gc : destroy");
    }
}
