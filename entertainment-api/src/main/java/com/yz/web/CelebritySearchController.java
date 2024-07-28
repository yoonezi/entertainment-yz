package com.yz.web;

import com.yz.core.domain.celebrity.Celebrity;
import com.yz.core.domain.celebrity.CelebrityRepository;
import com.yz.web.dto.response.CelebrityResponse;
import com.yz.web.dto.response.MainCelebrityResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/celebrity/search")
@RequiredArgsConstructor
public class CelebritySearchController {
    private final CelebrityRepository celebrityRepository;

    @GetMapping("/{celebrityId}")
    public CelebrityResponse findCelebrity(@PathVariable Long celebrityId)
    {
        Celebrity celebrity = celebrityRepository.findById(celebrityId).orElseThrow();

        return CelebrityResponse.of(celebrity);
    }

    @GetMapping("/main")
    public MainCelebrityResponse findMainCelebrity(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "10") int size
    ) {
        PageRequest pageable = PageRequest.of(page, size);
        Page<Celebrity> celebrityPage = celebrityRepository.findAll(pageable);

        return MainCelebrityResponse.of(celebrityPage);
    }
}
