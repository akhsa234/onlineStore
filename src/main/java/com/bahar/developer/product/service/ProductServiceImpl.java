package com.bahar.developer.product.service;

import com.bahar.developer.product.convertor.product.DTOConvertToProduct;
import com.bahar.developer.product.convertor.product.ProductConvertToDTO;
import com.bahar.developer.product.dto.ProductDTO;
import com.bahar.developer.product.exception.NotFoundException;
import com.bahar.developer.product.model.Product;
import com.bahar.developer.product.repository.ProductDbRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProductServiceImpl implements ProductService{

    private final ProductDbRepository productDbRepository;
    private final DTOConvertToProduct dtoConvertToProduct;
    private final ProductConvertToDTO productConvertToDTO;


    public List<ProductDTO> getAllProducts() {
        return productDbRepository.findAll()
                .stream()
                .map(productConvertToDTO::convert)
                .collect(Collectors.toList());

    }

    public ProductDTO findById(Long id) {
        Product product = productDbRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("No product was found with id=" + id));
        return productConvertToDTO.convert(product);


    }

    public ProductDTO saveProduct(ProductDTO productDTO) {

        Product product = dtoConvertToProduct.convert(productDTO);
        Product productCreated = productDbRepository.save(product);

        return productConvertToDTO.convert(productCreated);

    }


    public ProductDTO findProductDtoById(ProductDTO productDtoDetails, Long id) {
        Product product = productDbRepository.findById(id).get();

        if (product != null) {
            Product updateSetInfo = dtoConvertToProduct.convert(productDtoDetails);
            product.setName(updateSetInfo.getName());
            product.setDescription(updateSetInfo.getDescription());
            product.setUpc(updateSetInfo.getUpc());

            Product updatedPaper = productDbRepository.save(product); // save in db

            return productConvertToDTO.convert(updatedPaper); // send productDto to view


        }
        return null;//todo throw exception
    }

    @Override
    public void updateProductDescription(Long paperIds, String productDescription) {

        Product updateProductDescription = productDbRepository.findProductById(paperIds);
        if (updateProductDescription != null) {
            updateProductDescription.setDescription(productDescription);
            productDbRepository.save(updateProductDescription);
        } else {
            new NotFoundException("There is no Tag with this " + paperIds + " ");
        }
    }

    public void delete(Long id) {
        productDbRepository.deleteById(id);

    }
}
