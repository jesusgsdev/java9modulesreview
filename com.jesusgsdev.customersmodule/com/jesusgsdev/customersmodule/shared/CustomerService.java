package com.jesusgsdev.customersmodule.shared;

import com.jesusgsdev.customersmodule.DummyCustomersData;

import java.util.stream.Stream;

public class CustomerService {

    public static Stream<Customer> getCustomers(){
        return DummyCustomersData.customers.stream();
    }

}
