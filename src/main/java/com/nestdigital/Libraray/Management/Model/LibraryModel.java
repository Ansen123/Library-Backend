package com.nestdigital.Libraray.Management.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="library")
public class LibraryModel {
    @Id
    @GeneratedValue
    private int id;
    private String bookName;
    private String authorName;
    private int publishYear;

    public LibraryModel(int id, String bookName, String authorName, int publishYear) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishYear = publishYear;
    }

    public LibraryModel() {
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}
