package com.jesusgsdev.reportingmodule;

import com.jesusgsdev.customersmodule.shared.Customer;
import com.jesusgsdev.customersmodule.shared.CustomerService;

import java.util.Comparator;

public class ReportingTool {

    public static Customer getCustomerWhoSpentMoreOnBooks() {
        return CustomerService.getCustomers().max(Comparator.comparing(Customer::spentOnBooks)).get();
    }

}
