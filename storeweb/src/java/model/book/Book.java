/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.book;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author hoaha
 */
public class Book implements Serializable{
    private int id;
    private String ISBN;
    private String title;
    private String summary;
    private Date numberOfDate;
    private String language;
    private Date publicationDate;
    private Author author;
    private Publisher publisher;

    public Book() {
    }

    public Book(int id, String IBSN, String title, String summary, Date numberOfDate, String language, Date publicationDate, Author author, Publisher publisher) {
        this.id = id;
        this.ISBN = IBSN;
        this.title = title;
        this.summary = summary;
        this.numberOfDate = numberOfDate;
        this.language = language;
        this.publicationDate = publicationDate;
        this.author = author;
        this.publisher = publisher;
    }

    public Book(int id, String IBSN, String title, String summary, Date numberOfDate, String language, Date publicationDate) {
        this.id = id;
        this.ISBN = IBSN;
        this.title = title;
        this.summary = summary;
        this.numberOfDate = numberOfDate;
        this.language = language;
        this.publicationDate = publicationDate;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIBSN() {
        return ISBN;
    }

    public void setIBSN(String IBSN) {
        this.ISBN = IBSN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getNumberOfDate() {
        return numberOfDate;
    }

    public void setNumberOfDate(Date numberOfDate) {
        this.numberOfDate = numberOfDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    
    
    
            
}
