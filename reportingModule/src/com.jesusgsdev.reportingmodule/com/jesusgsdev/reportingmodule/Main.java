package com.jesusgsdev.reportingmodule;

import com.jesusgsdev.customersmodule.shared.Customer;

public class Main {

    public static void main(String[] args) {
        Customer customerSpentMore = ReportingTool.getCustomerWhoSpentMoreOnBooks();
        System.out.println("The Customer who more spent on Books was " + customerSpentMore.getName());
    }

}