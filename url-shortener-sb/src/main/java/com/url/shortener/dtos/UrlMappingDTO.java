package com.url.shortener.dtos;

import com.url.shortener.repository.UrlMappingRepository;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UrlMappingDTO {

    private Long id;
    private String originalUrl;
    private String shortUrl;
    private int clickCount = 0;
    private LocalDateTime createdAt;
    private String username;
}
