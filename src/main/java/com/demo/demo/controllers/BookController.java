package com.demo.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.entities.Books;
import com.demo.demo.service.BookService;

import io.micrometer.core.instrument.Meter.Id;

@RestController
public class BookController {

    @Autowired
    private BookService bookservice;

   /*  @RequestMapping(value="/books" , method = RequestMethod.GET)
    @ResponseBody */

    /* @GetMapping("/books")
    public List<Books> getbook(){
        return this.bookservice.getbooks();
    } */

    @GetMapping("/books")
    public ResponseEntity<List<Books>> getbooks(){
         List<Books> list = this.bookservice.getbooks();

         if(list.size() <= 0){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
         }
           return ResponseEntity.of(Optional.of(list));
        
    }

    @GetMapping("/books/{id}")
    public Books getbyid(@PathVariable("id") int id){
        return this.bookservice.getbookbyid(id);
    }


    
}
