package com.demo.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.demo.entities.Books;
@Component
public class BookService {

    private static List<Books> books = new ArrayList<>();

    static{
        books.add(new Books(1, "vishal", "new world of spring boot"));
        books.add(new Books(2, "ram", "think big"));
        books.add(new Books(3, "sham", "view world"));
        books.add(new Books(4, "vinay", "find yourself"));
    }

    public List<Books> getbooks(){
        return books;
    }

    public Books getbookbyid(int id){

        Books book = null;
        book = books.stream().filter(e->e.getId() == id).findFirst().get();
        return book;

    }
    
}
