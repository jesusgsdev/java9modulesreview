package com.jesusgsdev.reportingmodule;

import com.jesusgsdev.booksmodule.shared.Book;
import com.jesusgsdev.customersmodule.shared.Customer;
import com.jesusgsdev.customersmodule.shared.CustomerService;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReportingTool {

    public static Customer getCustomerWhoSpentMoreOnBooks() {
        return CustomerService.getCustomers()
                .max(Comparator.comparing(Customer::spentOnBooks))
                .get();
    }

    public static Book getMostBoughtBook() {
        return CustomerService.getCustomers()
                .flatMap(customer -> customer.getBoughtBooks().stream())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .get();
    }

}
