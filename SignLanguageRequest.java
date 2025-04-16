package com.sign2text.model;

import lombok.Data;

@Data
public class SignLanguageRequest {
    private String gestureData;
    private String userId; // Optional for user-specific processing
}