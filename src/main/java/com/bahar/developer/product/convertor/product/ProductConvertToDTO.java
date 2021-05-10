package com.bahar.developer.product.convertor.product;

import com.bahar.developer.product.dto.ImageDTO;
import com.bahar.developer.product.dto.ProductDTO;
import com.bahar.developer.product.model.Image;
import com.bahar.developer.product.model.Product;
import org.springframework.core.convert.converter.Converter;

public class ProductConvertToDTO implements Converter<Product, ProductDTO> {


    @Override
    public ProductDTO convert(Product product) {
        if (product == null) {
            return null;
        }
        ProductDTO productDTO= new ProductDTO();
        productDTO.setName(product.getName());
        productDTO.setUpc(product.getUpc());
        productDTO.setDescription(product.getDescription());



        return productDTO;
    }
}
