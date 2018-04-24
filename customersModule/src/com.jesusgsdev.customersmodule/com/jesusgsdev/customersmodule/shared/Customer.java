package com.jesusgsdev.customersmodule.shared;

import com.jesusgsdev.booksmodule.shared.Book;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Customer {

    private String email;
    private String name;
    private List<Book> boughtBooks;

    public Customer(String email, String name) {
        this.email = email;
        this.name = name;
        boughtBooks = new LinkedList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBoughtBooks() {
        return boughtBooks;
    }

    public void setBoughtBooks(List<Book> boughtBooks) {
        this.boughtBooks = boughtBooks;
    }

    public Integer spentOnBooks(){
        return boughtBooks.stream().mapToInt(Book::getPrice).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(email, customer.email) &&
                Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", boughtBooks=" + boughtBooks +
                '}';
    }
}
