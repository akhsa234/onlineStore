package com.bahar.developer.product.convertor.supplier;

import com.bahar.developer.product.dto.ProductDTO;
import com.bahar.developer.product.dto.SupplierDTO;
import com.bahar.developer.product.model.Product;
import com.bahar.developer.product.model.Supplier;
import org.springframework.core.convert.converter.Converter;

public class DTOConvertToSupplier implements Converter<SupplierDTO, Supplier>  {

        @Override
        public Supplier convert(SupplierDTO supplierDTO) {
        if (supplierDTO == null) {
            return null;
        }
            Supplier supplier = new Supplier();

        supplier.setName(supplierDTO.getName());
        supplier.setDescription(supplierDTO.getDescription());
        // image.setProduct()


        return supplier;
    }
}
