package com.jesusgsdev.customersmodule.shared;

import com.jesusgsdev.customersmodule.DummyCustomerData;

import java.util.stream.Stream;

public class CustomerService {

    public static Stream<Customer> getCustomers(){
        return DummyCustomerData.customers.stream();
    }

}
