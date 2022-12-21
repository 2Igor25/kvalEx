package com.server.kval.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.File;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    private String name;

    private int quantity;

    private String description;

    @Enumerated(EnumType.STRING)
    private AgeLimit ageLimit;

    private File img;

    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories category;

}
