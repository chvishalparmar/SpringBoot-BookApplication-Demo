package com.demo.demo.entities;

public class Books {

    private int id;
    private String author;
    private String title;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Books [id=" + id + ", author=" + author + ", title=" + title + "]";
    }
    public Books() {
    }
    public Books(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    
}
