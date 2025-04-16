package com.sign2text.service;

import com.sign2text.model.Conversion;
import com.sign2text.model.SignLanguageRequest;
import com.sign2text.repository.ConversionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignLanguageService {
    
    private final ConversionRepository conversionRepository;
    
    @Autowired
    public SignLanguageService(ConversionRepository conversionRepository) {
        this.conversionRepository = conversionRepository;
    }
    
    public String processGesture(SignLanguageRequest request) {
        // In a real application, you would implement gesture recognition here
        // For demo purposes, we'll just return a simple mapping
        
        String gesture = request.getGestureData();
        String result;
        
        // Simple mapping for demo
        switch(gesture.toUpperCase()) {
            case "A": result = "A"; break;
            case "B": result = "B"; break;
            case "C": result = "C"; break;
            case "L": result = "L"; break;
            case "V": result = "V"; break;
            case "Y": result = "Y"; break;
            default: result = "?"; break;
        }
        
        // Save to database
        Conversion conversion = new Conversion();
        conversion.setInputGesture(gesture);
        conversion.setOutputText(result);
        conversionRepository.save(conversion);
        
        return result;
    }
}