package com.yz.web;

import com.yz.service.CelebrityService;
import com.yz.service.dto.reqeust.CreateCelebrityServiceRequest;
import com.yz.service.dto.reqeust.UpdateCelebrityServiceRequest;
import com.yz.web.dto.reqeust.CreateCelebrityRequest;
import com.yz.web.dto.reqeust.UpdateCelebrityRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/celebrity")
@RequiredArgsConstructor
public class CelebrityController {

    private final CelebrityService celebrityService;

    @PostMapping
    public Long createCelebrity(@Valid @RequestBody CreateCelebrityRequest request)
    {
        CreateCelebrityServiceRequest serviceDto = request.toServiceDto();
        return celebrityService.createCelebrity(serviceDto);
    }

    @PutMapping("/{celebrityId}")
    public Long updateCelebrity(@PathVariable Long celebrityId, @Valid @RequestBody UpdateCelebrityRequest request)
    {
        UpdateCelebrityServiceRequest serviceDto = request.toServiceDto(celebrityId);
        return celebrityService.updateCelebrity(serviceDto);
    }

    @DeleteMapping("/{celebrityId}")
    public void deleteCelebrity(@PathVariable Long celebrityId)
    {
        celebrityService.deleteCelebrity(celebrityId);
    }
}


