package com.bahar.developer.product.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Builder
//@Accessors(chain=true)
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String description;
    @Lob
    byte[] content;
    private String path;
    private String url;


//    @ManyToOne(cascade = {CascadeType.ALL})
//    @JoinColumn(name = "images")
//    private Product product;


}
