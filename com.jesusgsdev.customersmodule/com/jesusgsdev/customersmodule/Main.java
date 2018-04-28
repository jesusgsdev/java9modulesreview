package com.jesusgsdev.customersmodule;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World from Customers Module! :)");
        DummyCustomersData.customers.forEach(System.out::println);
    }

}