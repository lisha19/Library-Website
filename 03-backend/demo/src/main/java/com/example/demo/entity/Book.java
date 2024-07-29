package com.example.demo.entity;
import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Qualifier;

@Entity

@Table(name= "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
private Long id;

    @Column(name ="title")
private String title;
    @Column(name="author")
private String author;

    @Column(name="description")
private  String description;
@Column(name = "copies")

private int copies;
@Column(name ="copiesAvailable")
private int copiesAvailable;
@Column(name = "category")
private String category;
@Column(name="img")
private String img;

}
