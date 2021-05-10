package com.bahar.developer.product.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Accessors(chain=true)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

//    @OneToMany(mappedBy = "category")
//    private List<Product> categortProductList;



}
