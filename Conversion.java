package com.sign2text.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@Entity
@Table(name = "conversions")
public class Conversion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String inputGesture;
    
    @Column(nullable = false)
    private String outputText;
    
    @CreationTimestamp
    @Column(updatable = false)
    private Date createdAt;
}