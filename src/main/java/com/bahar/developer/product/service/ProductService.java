package com.bahar.developer.product.service;

import com.bahar.developer.product.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    public List<ProductDTO> getAllProducts() ;
    public ProductDTO findById(Long id);
    public ProductDTO saveProduct(ProductDTO productDTO) ;
    public ProductDTO findProductDtoById(ProductDTO productDtoDetails, Long id) ;
    public void delete(Long id) ;
    public void updateProductDescription(Long paperIds, String productDescription);
}
