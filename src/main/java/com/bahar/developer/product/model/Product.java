package com.bahar.developer.product.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
//@Accessors(chain=true)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private long Id;
   private String name;
   private String upc;
   private String description;

//   @OneToMany(cascade = CascadeType.ALL)
//   private Set<Image> photos;
//
//   @ManyToOne(cascade = CascadeType.ALL)
//   @JoinColumn(name = "SuppliersProduct")
//   private Supplier supplier;
//
//   @ManyToOne(cascade = CascadeType.ALL)
//   @JoinColumn(name="CategoryOfProduct")
//   private Category category;


}
