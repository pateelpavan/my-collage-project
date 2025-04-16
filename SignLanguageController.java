package com.sign2text.controller;

import com.sign2text.model.SignLanguageRequest;
import com.sign2text.service.SignLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sign-language")
@CrossOrigin(origins = "*") // Allow all origins for development
public class SignLanguageController {
    
    private final SignLanguageService signLanguageService;
    
    @Autowired
    public SignLanguageController(SignLanguageService signLanguageService) {
        this.signLanguageService = signLanguageService;
    }
    
    @PostMapping("/convert")
    public ResponseEntity<String> convertSignToText(@RequestBody SignLanguageRequest request) {
        String result = signLanguageService.processGesture(request);
        return ResponseEntity.ok(result);
    }
    
    @GetMapping("/test")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("Backend is working!");
    }
}