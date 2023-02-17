package com.example.firebasestoragedemo.controller;

import com.example.firebasestoragedemo.service.FirebaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@Slf4j
@RequestMapping("/api/v1/firebase-demo")
public class FirebaseController {

    private FirebaseService firebaseService;

    @Autowired
    public FirebaseController(FirebaseService firebaseService){
        this.firebaseService = firebaseService;
    }

    @PostMapping("/profile/pic")
    public Object upload(@RequestParam("file")MultipartFile file){
        log.info("HIT -/upload | File Name : {}",file.getOriginalFilename());
        return firebaseService.upload(file);
    }
}
