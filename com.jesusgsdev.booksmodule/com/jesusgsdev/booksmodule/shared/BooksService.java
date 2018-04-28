package com.jesusgsdev.booksmodule.shared;

import com.jesusgsdev.booksmodule.DummyBooksData;

import java.util.Random;

public class BooksService {

    public static Book getRandomBook(){
        return DummyBooksData.catalogue.get(new Random().nextInt(DummyBooksData.catalogue.size()));
    }

}
