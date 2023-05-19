package com.example.service;

import com.example.giftsertificate.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TagService {
private final TagRepository tagRepository;

}
