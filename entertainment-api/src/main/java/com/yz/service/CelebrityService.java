package com.yz.service;

import com.yz.core.domain.celebrity.Celebrity;
import com.yz.core.domain.celebrity.CelebrityRepository;
import com.yz.service.dto.reqeust.CreateCelebrityServiceRequest;
import com.yz.service.dto.reqeust.UpdateCelebrityServiceRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CelebrityService {
    private final CelebrityRepository celebrityRepository;

    public Long createCelebrity(CreateCelebrityServiceRequest request)
    {
        Celebrity celebrity = celebrityRepository.findByName(request.name()).orElseThrow();
        celebrityRepository.save(celebrity);

        return celebrity.getCelebrityId();
    }

    public Long updateCelebrity(UpdateCelebrityServiceRequest request)
    {
        Celebrity celebrity = celebrityRepository.findByName(request.name()).orElseThrow();
        celebrity.update(
                request.celebrityId(),
                request.name(),
                request.subscriberCount(),
                request.movieCount()
        );
        return celebrity.getCelebrityId();
    }

    public void deleteCelebrity(Long celebrityId)
    {
        Celebrity celebrity = celebrityRepository.findById(celebrityId).orElseThrow();
        celebrityRepository.delete(celebrity);
    }
}
