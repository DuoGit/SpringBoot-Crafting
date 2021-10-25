package com.experiment.examination.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(
        name = "Person",
        uniqueConstraints = @UniqueConstraint(columnNames = {"PersonName"})
)
@NoArgsConstructor
@Getter
public class Person implements User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PersonId")
    private long Id;
    @Column(name = "PersonName")
    @Setter
    private String personName;

    public Person(String personName) {
        this.personName = personName;
    }
}
