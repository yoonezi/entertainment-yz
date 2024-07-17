package com.yz.web;

import com.yz.core.domain.celebrity.CelebrityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class CelebrityController {
    private final CelebrityRepository celebrityRepository;

}
