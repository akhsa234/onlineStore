package com.bahar.developer.product.controller;

import com.bahar.developer.product.service.FileStorageService;
import com.bahar.developer.product.service.FileStorageServiceImpl;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sun.security.util.Resources_pt_BR;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class FileDownloadController {

    private static final Logger logger = LoggerFactory.getLogger(LoggerFactory.class);
    private final FileStorageServiceImpl fileStorageService;

    @GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName,
                                                 HttpServletRequest request) {
        // Load file as Resource
        Resource resource = fileStorageService.loadFileAsResource(fileName);


       return null;
    }


}
