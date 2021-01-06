package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @ForeignKey(foreignKeyDefinition = )
//    private Integer laptopUserId;

    private String laptopName;
    private Integer price;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
