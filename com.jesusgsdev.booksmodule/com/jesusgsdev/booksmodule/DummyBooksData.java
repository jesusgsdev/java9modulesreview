package com.jesusgsdev.booksmodule;

import com.jesusgsdev.booksmodule.shared.Book;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DummyBooksData {

    public static List<Book> catalogue = IntStream.range(1,20)
            .mapToObj(i -> new Book("Book Title " + i, 2*i, "Book Author " + i%5))
            .collect(Collectors.toList());

}
