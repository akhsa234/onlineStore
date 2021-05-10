package com.bahar.developer.product.controller;

import com.bahar.developer.product.model.Responses;
import com.bahar.developer.product.service.FileStorageServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.xml.ws.Response;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class FileUploadController {


    private final FileStorageServiceImpl fileStorageService;

    @PostMapping("/uploadFile")
    public Responses uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = fileStorageService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();

        return new Responses(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }

    @PostMapping("/uploadMultipleFiles")
    public List<Response> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {

//        return Arrays.asList(files)
//                .stream()
//                .map( uploadFile::file)
//                .collect(Collectors.toList());
        return null;
    }

}
