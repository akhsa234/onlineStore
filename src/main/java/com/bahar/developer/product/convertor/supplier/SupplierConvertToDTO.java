package com.bahar.developer.product.convertor.supplier;

import com.bahar.developer.product.dto.ProductDTO;
import com.bahar.developer.product.dto.SupplierDTO;
import com.bahar.developer.product.model.Product;
import com.bahar.developer.product.model.Supplier;
import org.springframework.core.convert.converter.Converter;

public class SupplierConvertToDTO implements Converter<Supplier, SupplierDTO> {


    @Override
    public SupplierDTO convert(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        SupplierDTO supplierDTO= new SupplierDTO();
        supplierDTO.setName(supplier.getName());
        supplierDTO.setDescription(supplier.getDescription());


        return supplierDTO;
    }
}
