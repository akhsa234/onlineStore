package com.bahar.developer.product.convertor.product;

import com.bahar.developer.product.dto.ImageDTO;
import com.bahar.developer.product.dto.ProductDTO;
import com.bahar.developer.product.model.Image;
import com.bahar.developer.product.model.Product;
import org.springframework.core.convert.converter.Converter;

public class DTOConvertToProduct implements Converter<ProductDTO, Product> {

    @Override
    public Product convert(ProductDTO productDTO) {
        if (productDTO == null) {
            return null;
        }
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        // image.setProduct()


        return product;
    }

}