package com.bahar.developer.product.convertor.image;

import com.bahar.developer.product.dto.ImageDTO;
import com.bahar.developer.product.model.Image;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DTOConvertToImage implements Converter<ImageDTO,Image> {

    @Override
    public Image convert(ImageDTO imageDTO) {
        if (imageDTO == null) {
            return null;
        }
        Image image= new Image();
        image.setContent(imageDTO.getContent());
        image.setName(imageDTO.getName());
        image.setUrl(imageDTO.getUrl());
        image.setDescription(imageDTO.getDescription());
       // image.setProduct()


        return image;
    }
}
