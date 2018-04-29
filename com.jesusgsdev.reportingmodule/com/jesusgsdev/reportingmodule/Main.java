package com.jesusgsdev.reportingmodule;

import com.jesusgsdev.booksmodule.shared.Book;
import com.jesusgsdev.customersmodule.shared.Customer;

public class Main {

    public static void main(String[] args) {
        Customer customerSpentMore = ReportingTool.getCustomerWhoSpentMoreOnBooks();
        System.out.println("The Customer who more spent on Books was " + customerSpentMore.getName());
        Book mostBoughtBook = ReportingTool.getMostBoughtBook();
        System.out.println("The Book bought more times was " + mostBoughtBook.getTitle());
    }

}