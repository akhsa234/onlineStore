package com.bahar.developer.product.convertor.image;

import com.bahar.developer.product.dto.ImageDTO;
import com.bahar.developer.product.model.Image;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ImageConvertToDTO implements Converter<Image, ImageDTO> {


    @Override
    public ImageDTO convert(Image image) {
        if (image == null) {
            return null;
        }
        ImageDTO imageDTO= new ImageDTO();
        imageDTO.setContent(image.getContent());
        imageDTO.setName(image.getName());
        imageDTO.setUrl(image.getUrl());
        imageDTO.setDescription(image.getDescription());



        return imageDTO;
    }


}
