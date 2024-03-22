package pl.edu.s28201.tpo_04.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Author> authors;
    @ManyToOne(fetch = FetchType.EAGER)
    private Publisher publisher;

    public Book(String title, List<Author> authors, Publisher publisher) {
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
    }

    public Book() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                ", publisher=" + publisher +
                '}';
    }
}
