package com.example.firebasestoragedemo.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public interface FirebaseService {
    String uploadFile (File file, String fileName) throws IOException;
    File convertToFile(MultipartFile multipartFile, String fileName) throws IOException;
    String getExtension(String fileName);
    Object upload(MultipartFile multipartFile);
}
