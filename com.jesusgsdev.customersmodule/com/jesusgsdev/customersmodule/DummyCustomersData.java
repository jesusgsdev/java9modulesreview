package com.jesusgsdev.customersmodule;

import com.jesusgsdev.booksmodule.shared.BooksService;
import com.jesusgsdev.customersmodule.shared.Customer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DummyCustomersData {

    public static List<Customer> customers = IntStream.range(1,20)
            .mapToObj(i -> new Customer("customer.email " + i, "Jesus" + i))
            .peek(customer -> customer.getBoughtBooks().add(BooksService.getRandomBook()))
            .collect(Collectors.toList());

}
