package com.bahar.developer.product.controller;

import com.bahar.developer.product.dto.ImageDTO;
import com.bahar.developer.product.model.Image;
import com.bahar.developer.product.service.ImageServiceImp;
import lombok.RequiredArgsConstructor;
import java.io.*;
import java.nio.*;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;



@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ImageController {

    private  final ImageServiceImp imageService;


    //Image Upload
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Image saveImage(@RequestParam("file") MultipartFile file
                            , @RequestParam("description") String description
                              ) throws Exception{

          return imageService.saveImage(file,description);

    }

// Image Download

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value="/download/{imageId}" ,produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] downloadImage(String imageName) throws Exception{
        InputStream inputStream= new FileInputStream(/*path+*/imageName); //todo
      //  byte[] bytes = IOUtils.toByteArray(inputStream);
       // return ByteStreams.toByteArray(inputStream);
        return IOUtils.toByteArray(inputStream);

    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ImageDTO getImageById(Long id){
        return imageService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(Long id){
        imageService.delete(id);
   }



}
