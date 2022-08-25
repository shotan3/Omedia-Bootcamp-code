package dev.omedia.restwebservice.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "user")
@Table(name = "user", schema = "public")
@Data
@NoArgsConstructor
public class User {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;
}
