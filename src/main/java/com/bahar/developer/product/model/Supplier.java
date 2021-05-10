package com.bahar.developer.product.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

/**
 *
 */
@Data
@Entity
@Accessors(chain=true)
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   // @NotNull
   private String name;
    private String description;

//   @OneToMany(mappedBy = "supplier")
//   private List<Product> supplierProductList;

}
