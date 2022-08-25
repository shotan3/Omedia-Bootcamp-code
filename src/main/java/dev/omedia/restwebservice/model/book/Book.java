package dev.omedia.restwebservice.model.book;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "book")
@Table(schema = "public")
@Data
@NoArgsConstructor
public class Book {
    @Id
    private Long id;

    @Column(name = "book_name")
    private String bookName;
}
